package command.sample02;
class ConcreteCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}