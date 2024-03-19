package action.impl;

import action.Ac2;
import action.IAdapter;

public class Ac2Impl implements IAdapter {

    Ac2 ac2 = new Ac2();

    @Override
    public void hello(String hello, String world) {
        ac2.methodHello(hello, world);
    }
}
