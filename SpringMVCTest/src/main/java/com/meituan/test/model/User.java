package com.meituan.test.model;

import org.springframework.stereotype.Component;

/**
 * Created by zhaofuyu on 2017/10/30.
 */
@Component
public class User {
    String username;
    String password;
    public User(String username,String password){
        this.username = username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
