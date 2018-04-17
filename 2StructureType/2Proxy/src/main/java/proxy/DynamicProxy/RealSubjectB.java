package proxy.DynamicProxy;

public class RealSubjectB implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题类B！");
    }
}
