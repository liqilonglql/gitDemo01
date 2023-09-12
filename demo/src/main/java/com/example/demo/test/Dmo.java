package com.example.demo.test;

import com.example.demo.bean.User;

public class Dmo {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("wangwu");
        user.setSex("nv");
        System.out.println("user = " + user);
    }

}
