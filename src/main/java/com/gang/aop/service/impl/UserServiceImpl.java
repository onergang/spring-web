package com.gang.aop.service.impl;

import com.gang.aop.dao.UserDao;
import com.gang.aop.po.User;
import com.gang.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @Company: 伟业我爱我家
 * @Author GaoGang
 * @Date 2016-08-09 10:55
 * @Version V1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService<User> {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public boolean addUser(User entity) {
        return true;
    }

    @Override
    public boolean editUser(User entity) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    public boolean findUser(String id) {
        return false;
    }

    @Override
    public List<User> getUser(Map<String, Object> condition) {
        return userDao.getUser(condition);
    }
}
