package com.donkey.service.impl;

import com.donkey.base.BaseServiceImpl;
import com.donkey.dao.UserDao;
import com.donkey.entity.User;
import com.donkey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by zcool on 2020/5/19.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void createUser(String username,String password,String email){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        this.userDao.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public boolean checkUser (String email, String password) {
        User user = this.userDao.findByEmail(email);
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(password)) {
            return false;
        }
        return true;
    }

    @Override
    public String LoginUser(User user) {
        String token = UUID.randomUUID().toString();
        return token;
    }

}
