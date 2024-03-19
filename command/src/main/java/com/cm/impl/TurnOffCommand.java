package com.cm.impl;

import com.cm.ICommand;
import com.cm.Light;

public class TurnOffCommand implements ICommand {

    private final Light light;
    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
