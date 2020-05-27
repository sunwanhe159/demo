package com.donkey.service;

import com.donkey.base.BaseService;
import com.donkey.entity.User;

/**
 * Created by zcool on 2020/5/19.
 */
public interface UserService extends BaseService<User> {

    void createUser(String username,String password,String email);
    boolean checkUser (String email, String password);

    /**
     * 根据 Email 查询用户
     * @param email
     * @return
     */
    User findByEmail(String email);

    /**
     * 用户登录
     *
     * @param user
     * @return 返回token
     */
    String LoginUser(User user);

}
