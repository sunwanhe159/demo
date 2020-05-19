package com.donkey.service.impl;

import com.donkey.dao.UserDao;
import com.donkey.entity.User;
import com.donkey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zcool on 2020/5/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void createUser(String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        this.userDao.save(user);

    }


}
