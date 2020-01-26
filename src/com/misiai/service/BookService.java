package com.misiai.service;

import com.misiai.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;
    public BookService() {
        System.out.println("BooKService无参构造！");
    }

    public void save() {
        System.out.println("BookService的save方法被调用 >>> 正在调用BookDao的save方法");
        bookDao.save();
    }

}
