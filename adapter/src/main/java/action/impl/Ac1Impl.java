package action.impl;

import action.Ac1;
import action.IAdapter;

public class Ac1Impl implements IAdapter {

    Ac1 ac1 = new Ac1();

    @Override
    public void hello(String hello, String world) {
        ac1.helloMethod(hello, world);
    }
}
