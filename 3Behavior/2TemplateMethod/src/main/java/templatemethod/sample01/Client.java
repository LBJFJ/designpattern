package templatemethod.sample01;

public class Client {
    public static void main(String a[]) {
        BankTemplateMethod bank = (BankTemplateMethod) XMLUtil.getBean();
        bank.process();
        System.out.println("---------------------------------------");
    }
}
