package com.atguigu.Test;

import com.atguigu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@Service
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
//
//public class BooksService {
//    @Autowired
//    @Qualifier("booksDapImpl")
//    private BooksDao booksDao;
//
//    public void addUser(User user){
//        booksDao.addUser(user);
//    }
//}
