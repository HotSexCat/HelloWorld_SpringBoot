package com.lzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
   *标注一个主程序类，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class helloWorldMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(helloWorldMainApplication.class,args);
    }
}
