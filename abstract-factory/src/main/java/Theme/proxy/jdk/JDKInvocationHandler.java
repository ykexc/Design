package Theme.proxy.jdk;

import Theme.IAdapter;
import util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private final IAdapter iAdapter;

    public JDKInvocationHandler(IAdapter iAdapter) {
        this.iAdapter = iAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return IAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(iAdapter, args);
    }
}
