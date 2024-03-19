package Theme.impl;

import Theme.IAdapter;
import Theme.T2;

public class T2Impl implements IAdapter {


    T2 t2 = new T2();

    @Override
    public void f1() {
        t2.f1T2();
    }

    @Override
    public void f2() {
        t2.f2T2();
    }

    @Override
    public void f3() {
        t2.f3T2();
    }

    @Override
    public void f4() {
        t2.f4T2();
    }
}
