package Theme.impl;

import Theme.IAdapter;
import Theme.T1;

public class T1Impl implements IAdapter {

    T1 t1 = new T1();

    @Override
    public void f1() {
        t1.f1T1();
    }

    @Override
    public void f2() {
        t1.f2T1();
    }

    @Override
    public void f3() {
        t1.f3T1();
    }

    @Override
    public void f4() {
        t1.f4T1();
    }
}
