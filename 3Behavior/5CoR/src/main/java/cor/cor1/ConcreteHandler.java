package cor.cor1;
class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        // 条件
        super.successor.handleRequest(request); // 转发请求
    }
}
