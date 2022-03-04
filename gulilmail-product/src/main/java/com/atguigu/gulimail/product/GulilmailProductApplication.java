package com.atguigu.gulimail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis—plus
 */
@MapperScan("com/atguigu/gulimail/product/dao")
@SpringBootApplication
public class GulilmailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulilmailProductApplication.class, args);
    }

}
