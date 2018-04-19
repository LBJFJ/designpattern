package command.sample01.application;

import command.sample01.command.AbstractCommand;
import command.sample01.command.TVChangeCommand;
import command.sample01.command.TVCloseCommand;
import command.sample01.command.TVOpenCommand;
import command.sample01.invoker.Controller;

public class Client {
    public static void main(String a[]) {
        AbstractCommand openCommand = new TVOpenCommand();
        AbstractCommand closeCommand = new TVCloseCommand();
        AbstractCommand changeCommand = new TVChangeCommand();

        Controller control = new Controller(openCommand, closeCommand, changeCommand);

        control.open();
        control.change();
        control.close();
    }
}
