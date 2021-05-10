package com.atguigu.Test;


import com.atguigu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("services")
@Transactional
public class BookServiceWithTransaction {

    @Autowired
    BooksDao booksDao;

    public void addUser() {
        User user = new User(null,"七七七","777","qq");
        booksDao.addUser(user);
    }

    public void change(){
        addUser();
//        int i = 10/0;
        booksDao.change();
    }
}
