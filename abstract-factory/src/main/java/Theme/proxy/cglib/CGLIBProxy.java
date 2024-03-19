package Theme.proxy.cglib;

import Theme.IAdapter;
import net.sf.cglib.proxy.Enhancer;

@SuppressWarnings("unchecked")
public class CGLIBProxy {


    public static <T> T getProxy(Class<T> clazz, IAdapter adapter) {
        return (T) Enhancer.create(clazz, new CGLIBMethodIntercept(adapter));
    }


}
