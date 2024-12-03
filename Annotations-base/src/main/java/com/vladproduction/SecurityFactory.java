package com.vladproduction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityFactory {
    public static AccountManager registerSecurityObject(AccountManager target) {
        return (AccountManager) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new SecurityInvocationHandler(target));
    }

    private static class SecurityInvocationHandler implements InvocationHandler {
        private Object targetObject;

        SecurityInvocationHandler(Object target) {
            this.targetObject = target;
        }

        public Object invoke(Object proxy, Method method, Object[] args)
                throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
            SecurityService service = new SecurityService();
            Method invocationMethod = targetObject.getClass().getMethod(method.getName(),
                    (Class[]) method.getGenericParameterTypes());
            BankingAnnotation annotation = invocationMethod.getAnnotation(BankingAnnotation.class);
            if (annotation != null) {
                // method annotated
                service.onInvoke(annotation.securityLevel(), invocationMethod, args);
            } else {
        /* if annotation of method is required, it should
        throw an exception to the fact of its absence */
        /* throw new InvocationTargetException(null, "method" + invocationMethod
            + "should be annotated"); */
            }
            return method.invoke(targetObject, args);
        }
    }
}
