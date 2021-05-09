package com.atguigu.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class invocationHandlerTest implements InvocationHandler {
    Object obj;
    public invocationHandlerTest(Object obj){
        this.obj = obj;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(obj, args);
        System.out.println("执行");
        return res;
    }
}
