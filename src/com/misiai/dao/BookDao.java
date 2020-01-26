package com.misiai.dao;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("Misiai")
@Scope(value = "prototype")
public class BookDao {

    public BookDao() {
        System.out.println("BookDao 的无参构造！");
    }

    public void save() {
        System.out.println("BookDao的save方法");
    }
}
