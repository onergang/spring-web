package com.gang.aop.dao;

import com.gang.aop.po.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserDao
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @Company: 伟业我爱我家
 * @Author GaoGang
 * @Date 2016-08-09 10:57
 * @Version V1.0
 */
@Repository("userDao")
public interface UserDao {
    public void addUser(User entity);

    public void editUser(User entity);

    public void deleteUser(String id);

    public List<User> getUser(Map<String, Object> condition);
}
