package com.atguigu.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {


    @Test
    public void getName() {

    }

    @Test
    public void setName() {

    }

    @Test
    public void show() {
        //使用默认值的引用为4eb7f003
        //使用prototype的引用为a38d7a3 a38d7a3
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring)context.getBean("helloNew");
        helloSpring.show();
    }
}
