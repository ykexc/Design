package Theme.proxy.cglib;

import Theme.IAdapter;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import util.ClassLoaderUtils;

import java.lang.reflect.Method;

public class CGLIBMethodIntercept implements MethodInterceptor {

    private final IAdapter adapter;

    public CGLIBMethodIntercept(IAdapter adapter) {
        this.adapter = adapter;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return IAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(objects)).invoke(adapter, objects);
    }
}