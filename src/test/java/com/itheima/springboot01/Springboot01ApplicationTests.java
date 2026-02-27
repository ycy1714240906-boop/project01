package com.itheima.springboot01;

import com.itheima.springboot01.mapper.UserMapper;
import com.itheima.springboot01.pojo.LoginUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertLoginRequest() {
       userMapper.selectAll();



    }

}
