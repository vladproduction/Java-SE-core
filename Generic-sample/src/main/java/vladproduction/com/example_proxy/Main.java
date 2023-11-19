package vladproduction.com.example_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Client code
public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subjectProxy = ProxySubject.createProxy(realSubject);
        subjectProxy.doAction(); // Output: ProxySubject is handling the invocation.
                                                // RealSubject is performing action.
    }
}
