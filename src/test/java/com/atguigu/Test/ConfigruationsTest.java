package com.atguigu.Test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigruationsTest {

    @Test
    public void Test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configruations.class);
        System.out.println(applicationContext);
    }
}
