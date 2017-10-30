package com.meituan.test.dao;

import com.meituan.test.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by zhaofuyu on 2017/10/30.
 */
@Component
public class UserDaoImpl implements IUserDao {

    User u = new User("zfy","123456");

    public boolean login(String username,String password) {
        if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
