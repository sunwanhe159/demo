package com.donkey.dao;

import com.donkey.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zcool on 2020/5/14.
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);

    User findByEmail(String email);
}
