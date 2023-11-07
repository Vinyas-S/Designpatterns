package designpatters.command.commands;

import designpatters.command.receiver.Light;

public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
