package com.zy.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 14:19
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.zy")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
