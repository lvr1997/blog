package com.xgsxd.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.xgsxd.blog.dao")
@SpringBootApplication
@ServletComponentScan("com.xgsxd.utils")//配置扫描servlet注解


public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}

