package com.gang.practice.spring.dao;

import com.gang.practice.spring.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserDao
 * @Description:
 * @Author GaoGang
 * @Date 2016-08-22 15:54
 * @Version V1.0
 */
@Repository("userDao")
public interface UserDao {
    public void addUser(User entity);

    public void editUser(User entity);

    public void deleteUser(String id);

    public List<User> getUser(Map<String, Object> condition);
}
