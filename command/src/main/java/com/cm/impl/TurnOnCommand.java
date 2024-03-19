package com.cm.impl;

import com.cm.ICommand;
import com.cm.Light;

public class TurnOnCommand implements ICommand {

    private final Light light;
    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
