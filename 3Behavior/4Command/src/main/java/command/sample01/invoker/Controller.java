package command.sample01.invoker;

import command.sample01.command.AbstractCommand;

public class Controller {
    private AbstractCommand openCommand, closeCommand, changeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void change() {
        changeCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }
}
