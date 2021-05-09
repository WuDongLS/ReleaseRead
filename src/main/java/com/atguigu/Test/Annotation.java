package com.atguigu.Test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强类
//@Component
//@Aspect
//public class Annotation {
////    @Pointcut("execution(* com.atguigu.Test.AopAnnotation.*(..))")
////    public void pointCut(){
////
////    }
//
////    @Before("pointCut()")
//    public void before_eat(){
//        System.out.println("before eat");
//    }
//
////    @AfterReturning("pointCut()")
//    public void afterReturn(){
//        System.out.println("return");
//    }
//
////    @Around("execution(* com.atguigu.Test..AopAnnotation.*(..))")
//    public void around(ProceedingJoinPoint jp) throws Throwable{
//        System.out.println("around-first");
//        jp.proceed();
//        System.out.println("around-end");
//    }
//}
