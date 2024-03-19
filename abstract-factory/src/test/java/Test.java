import Theme.I;
import Theme.impl.Impl;
import Theme.impl.T1Impl;
import Theme.impl.T2Impl;
import Theme.proxy.cglib.CGLIBProxy;
import Theme.proxy.jdk.JDKProxy;

public class Test {


    @org.junit.Test
    public void test() {
        I proxy1 = JDKProxy.getProxy(Impl.class, new T1Impl());
        proxy1.f1();
        proxy1.f2();
        proxy1.f3();
        proxy1.f4();

        I proxy2 = CGLIBProxy.getProxy(Impl.class, new T2Impl());
        proxy2.f1();
        proxy2.f2();
        proxy2.f3();
        proxy2.f4();
    }

}
