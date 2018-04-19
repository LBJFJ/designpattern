package proxy.DynamicProxy.subject;

public class RealSubjectA implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题类A！");
    }
}
