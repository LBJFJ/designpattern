package templatemethod.sample01;

public class Deposit extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("存款");
    }
}
