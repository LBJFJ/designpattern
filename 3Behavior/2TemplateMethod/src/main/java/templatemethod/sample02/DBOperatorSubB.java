package templatemethod.sample02;
class DBOperatorSubB extends DBOperator {
    @Override
    public void connDB() {
        System.out.println("使用连接池连接数据库");
    }
}