package com.atguigu.Test;

import org.springframework.stereotype.Component;

//被增强类
@Component("aop")
public class AopAnnotation implements AopT{

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
