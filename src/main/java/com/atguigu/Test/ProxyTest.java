package com.atguigu.Test;

public class ProxyTest {
    public static void main(String[] args) {
        Add add = new Add();
        invocationHandlerTest invocationHandlerTest = new invocationHandlerTest(add);
        AddImp proxy = (AddImp) invocationHandlerTest.getProxy();
        System.out.println(proxy.add(1,2));
    }
}

