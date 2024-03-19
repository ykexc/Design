package Theme.proxy.jdk;

import Theme.IAdapter;

import java.lang.reflect.Proxy;

@SuppressWarnings("unchecked")
public class JDKProxy {


    public static<T> T getProxy(Class<T> clazz, IAdapter adapter) {
        JDKInvocationHandler jdkInvocationHandler = new JDKInvocationHandler(adapter);
        ClassLoader classLoader = clazz.getClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, clazz.getInterfaces(), jdkInvocationHandler);
    }

}
