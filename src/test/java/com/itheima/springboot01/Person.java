package com.itheima.springboot01;


import org.springframework.stereotype.Component;

@Component
public class Person {


    public int add(int a, int b) {
        // 模拟一些耗时操作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }
}
