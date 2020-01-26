package com.misiai.controller;

import com.misiai.dao.BookDao;
import com.misiai.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    public void hello(BookDao bookDao, BookService bookService1) {
        System.out.println("bookDao：" + bookDao);
        System.out.println("bookService1：" + bookService1);
    }

    public void getBook() {

        bookService.save();
    }

}
