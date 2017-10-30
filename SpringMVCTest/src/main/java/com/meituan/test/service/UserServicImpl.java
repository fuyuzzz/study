package com.meituan.test.service;

import com.meituan.test.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaofuyu on 2017/10/30.
 */
@Service
public class UserServicImpl {

    @Autowired
    private IUserDao dao;

    public boolean login(String username,String password){
        return dao.login(username,password);
    }
}
