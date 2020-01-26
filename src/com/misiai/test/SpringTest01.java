package com.misiai.test;

import com.misiai.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*自定配置文件位置：类路径下的applicationContext.xml*/
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest01 {

    @Autowired
    private BookService bookService;

    @Test
    public void test01() {
        System.out.println(bookService);
    }
}
