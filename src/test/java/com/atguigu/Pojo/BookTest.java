package com.atguigu.Pojo;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean2.xml");
    @Test
    public void test01(){
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

}
