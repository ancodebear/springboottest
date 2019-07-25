package com.hyq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * PROJECT springboottest
 * createdate 2019/7/23 15:48
 *
 * @author hyq
 * @version 1.0
 */

public class MyProxy<T>{
    T myProxy;
    Class proxyClass;
    public MyProxy(T proxy) {
        this.myProxy = proxy;
        this.proxyClass=proxy.getClass();
    }
    public MyProxy(Class c) {

        this.proxyClass=c;
        this.myProxy= (T) proxyClass.getInterfaces();
    }
    public T getProxy(Before bf,After af){
        @SuppressWarnings("all")
        T t = (T) Proxy.newProxyInstance(proxyClass.getClassLoader(), proxyClass.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                before(bf,method.getName(),proxyClass.getName());
                Object invoke = method.invoke(myProxy, args);
                after(af,method.getName(),proxyClass.getName());
                return invoke;
            }
        });
        return t;
    }
    public void before(Before bf,String methodname,String classname){
        bf.before(methodname,classname);
    }
    public void after(After af,String methodname,String classname){
        af.after(methodname,classname);
    }

}
interface Before{
    void before(String methodname,String classname);
}
interface After{
    void after(String methodname,String classname);
}
