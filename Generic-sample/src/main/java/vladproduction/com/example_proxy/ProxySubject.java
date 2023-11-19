package vladproduction.com.example_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Proxy class
class ProxySubject<T> implements InvocationHandler {
    private final T realSubject;

    public ProxySubject(T realSubject) {

        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ProxySubject is handling the invocation.");
        return method.invoke(realSubject, args);
    }

    public static <T> T createProxy(T realSubject) {
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, new ProxySubject<>(realSubject));
    }
}
