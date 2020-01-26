package com.misiai.test;

import com.misiai.controller.BookController;
import com.misiai.dao.BookDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    /*之前都是会定义一个成员变量，然后创建spring上下文
    * 然后在每个测试方法中通过ap.getBean()来获取对象，是不是有点麻烦？
    * */
    ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test03() {
        BookController bookController = ap.getBean("bookController", BookController.class);

    }

    @Test
    public void test02() {
        BookController bookController = ap.getBean("bookController", BookController.class);
        bookController.getBook();
    }

    @Test
    public void test01() {
        BookDao bookDao = ap.getBean("Misiai", BookDao.class);
        BookDao bookDao2 = ap.getBean("Misiai", BookDao.class);
        System.out.println(bookDao == bookDao2);
    }
}
