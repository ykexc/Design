package com.cm;

public class Invoker {

    private final Runnable action;


    public Invoker(Runnable action) {
        this.action = action;
    }
    public void invoke() {
        action.run();
    }

}
