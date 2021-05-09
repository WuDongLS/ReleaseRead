package com.atguigu.Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.atguigu.Pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

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
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
//        HelloSpring helloSpring = (HelloSpring)context.getBean("helloNew");
//        UserTest user = context.getBean("user", UserTest.class);
//        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
//        Connection connection = null;
//        try {
//            connection = dataSource.getConnection();
//            System.out.println(connection);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if (connection == null){
//                try {
//                    connection.close();
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }
//        helloSpring.show();
//        ApplicationContext context = new AnnotationConfigApplicationContext(Configruation.class);
//        UserTest user = context.getBean("user", UserTest.class);
//        user.show();

    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
        BooksService booksService = context.getBean("booksService", BooksService.class);
        User user = new User(null,"六七","67","67@qq.com");
        booksService.addUser(user);
//        ApplicationContext context = new AnnotationConfigApplicationContext(Configruations.class);
//        AopT aop = (AopT) context.getBean("aop");
//        aop.eat();
    }
}
