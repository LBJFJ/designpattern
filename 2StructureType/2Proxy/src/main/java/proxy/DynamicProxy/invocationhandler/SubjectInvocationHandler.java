package proxy.DynamicProxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectInvocationHandler implements InvocationHandler {
    private Object obj;

    public SubjectInvocationHandler() {}

    public SubjectInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        method.invoke(obj, args);
        postRequest();
        
        return null;
    }

    public void preRequest() {
        System.out.println("调用之前！");
    }

    public void postRequest() {
        System.out.println("调用之后！");
    }

}