package com.springbootpractise.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 来标注一个主程序类
//说明这是一个Spring Boot应用
@SpringBootApplication
public class PractiseApplication {

    public static void main(String[] args) {
        //以为是启动了一个方法，没想到启动了一个服务
        SpringApplication.run(PractiseApplication.class, args);
    }

}
