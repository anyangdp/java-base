package com.design;

import java.lang.reflect.Field;

/**
 * @Author anyang
 * @CreateTime 2018/4/17
 * @Des
 */
public class aaa {
    public static void main(String[] args) {
            User user = new User();
        try {
            System.out.println(user.getClass().getDeclaredField("name").getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
