package state.sample02;

class ConcreteStateA extends State {
    @Override
    public void handle() {
        // 方法具体实现代码
        System.out.println("A.handle()");
    }
}
