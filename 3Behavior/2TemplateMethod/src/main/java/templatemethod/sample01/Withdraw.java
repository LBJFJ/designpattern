package templatemethod.sample01;

public class Withdraw extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("取款");
    }
}
