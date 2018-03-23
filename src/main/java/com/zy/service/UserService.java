package com.zy.service;

import com.zy.repository.UserRepositoty;
import com.zy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 14:02
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;
    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
