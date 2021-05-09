package com.atguigu.Test;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
public class Annotation {
    @Before("execution(* com.atguigu.Test.AopAnnotation.*(..))")
    public void before_eat(){
        System.out.println("before eat");
    }

}
