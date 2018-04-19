package templatemethod.sample02;
class Client {
    public static void main(String a[]) {
        DBOperator db1 = new DBOperatorSubA();
        db1.process();
        
        System.out.println("---------------------------------------");
        
        DBOperator db2 = new DBOperatorSubB();
        db2.process();
    }
}