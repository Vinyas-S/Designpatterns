package designpatters.command;

import designpatters.command.commands.LightOffCommand;
import designpatters.command.commands.LightOnCommand;
import designpatters.command.receiver.Light;
import designpatters.command.remote.RemoteController;

public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteController.setCommand(lightOnCommand, lightOffCommand);
        System.out.println(light.getStatus());
        remoteController.onClick();
        System.out.println(light.getStatus());
        remoteController.offClick();
        System.out.println(light.getStatus());
    }
}
