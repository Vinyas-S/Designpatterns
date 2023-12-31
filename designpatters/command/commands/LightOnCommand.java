package designpatters.command.commands;

import designpatters.command.receiver.Light;

public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
