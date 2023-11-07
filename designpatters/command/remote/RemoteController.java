package designpatters.command.remote;

import designpatters.command.commands.Command;

public class RemoteController {
    Command onCommand;
    Command offCommand;

    public void setCommand(Command onCommand, Command offCommand){
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onClick(){
        this.onCommand.execute();
    }
    public void offClick(){
        this.offCommand.execute();
    }
}
