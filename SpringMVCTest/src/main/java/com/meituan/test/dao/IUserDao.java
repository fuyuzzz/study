package com.meituan.test.dao;

import com.meituan.test.model.User;

/**
 * Created by zhaofuyu on 2017/10/30.
 */
public interface IUserDao {
    public boolean login(String username,String password);
}
