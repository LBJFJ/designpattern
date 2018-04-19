package templatemethod.sample02;
class DBOperatorSubA extends DBOperator {
    @Override
    public void connDB() {
        System.out.println("使用JDBC-ODBC桥接连接数据库");
    }
}