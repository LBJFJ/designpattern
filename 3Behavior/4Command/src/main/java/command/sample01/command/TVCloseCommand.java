package command.sample01.command;

import command.sample01.receiver.Television;

public class TVCloseCommand implements AbstractCommand {
    private Television tv;

    public TVCloseCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
