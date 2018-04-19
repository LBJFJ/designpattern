package command.sample01.command;

import command.sample01.receiver.Television;

public class TVChangeCommand implements AbstractCommand {
    private Television tv;

    public TVChangeCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
