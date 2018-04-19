package proxy.DynamicProxy.application;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import proxy.DynamicProxy.invocationhandler.SubjectInvocationHandler;
import proxy.DynamicProxy.subject.RealSubjectA;
import proxy.DynamicProxy.subject.RealSubjectB;
import proxy.DynamicProxy.subject.Subject;

public class Client {
    public static void main(String args[]) {
        InvocationHandler handlerA = new SubjectInvocationHandler(new RealSubjectA());
        Subject subjectProxyA = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, handlerA);
        subjectProxyA.request();

        System.out.println("------------------------------");

        InvocationHandler handlerB = new SubjectInvocationHandler(new RealSubjectB());
        Subject subjectProxyB = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, handlerB);
        subjectProxyB.request();
    }
}
