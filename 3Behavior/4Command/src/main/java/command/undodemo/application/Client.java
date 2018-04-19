package command.undodemo.application;

import command.undodemo.command.ConcreteCommand;
import command.undodemo.invoker.CalculatorForm;

public class Client {
    public static void main(String args[]) {
        CalculatorForm form = new CalculatorForm();
        ConcreteCommand command = new ConcreteCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
