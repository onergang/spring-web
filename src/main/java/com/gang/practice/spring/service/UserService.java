package com.gang.practice.spring.service;

import com.gang.practice.spring.po.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserService
 * @Description:
 * @Author GaoGang
 * @Date 2016-08-22 15:54
 * @Version V1.0
 */
public interface UserService<T> {
    public boolean addUser(User entity);

    public boolean editUser(T entity);

    public boolean deleteUser(String id);

    public String checkUser(User user);

    public User getUserInfo(Integer id);

    public List<T> getUser(Map<String, Object> condition);

    public List<T> getUserList();


}
