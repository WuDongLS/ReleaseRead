package com.atguigu.Test;

import com.atguigu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
    @Autowired
    @Qualifier("booksDapImpl")
    private BooksDao booksDao;

    public void addUser(User user){
        booksDao.addUser(user);
    }
}
