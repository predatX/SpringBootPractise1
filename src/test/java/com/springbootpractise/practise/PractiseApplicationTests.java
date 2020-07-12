package com.springbootpractise.practise;

import com.springbootpractise.practise.pojo.Dog;
import com.springbootpractise.practise.pojo.Person;
import com.springbootpractise.practise.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PractiseApplicationTests {

    @Autowired  //通过之前Dog class的component，将dog自动注入进来
            User user;
            Person person;
    @Test
        public void contextLoads() {

            System.out.println(user);
        }

}
