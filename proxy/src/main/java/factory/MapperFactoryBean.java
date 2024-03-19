package factory;



//import handler.jdk.JDKInvocationHandler;
import handler.cglib.CGLIBInvocationHandler;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Proxy;


@SuppressWarnings("unchecked")
public class MapperFactoryBean<T> implements FactoryBean<T> {

    Class<T> interfaceClass;


    @Override
    public T getObject() throws Exception {
//         return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] {interfaceClass}, new JDKInvocationHandler());
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] {interfaceClass}, new CGLIBInvocationHandler());
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setInterfaceClass(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }
}
