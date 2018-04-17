package proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String args[]) {
        InvocationHandler handler = null;
        Subject subjectProxy = null;

        handler = new SubjectInvocationHandler(new RealSubjectA());
        subjectProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, handler);
        subjectProxy.request();

        System.out.println("------------------------------");

        handler = new SubjectInvocationHandler(new RealSubjectB());
        subjectProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, handler);
        subjectProxy.request();
    }
}
