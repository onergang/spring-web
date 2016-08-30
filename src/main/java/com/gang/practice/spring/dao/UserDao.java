package com.gang.practice.spring.dao;

import com.gang.practice.spring.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

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

    public void deleteUser(Integer id);

    public User checkUser(User user);

    public User getUserInfo(@Param("userId")Integer id);

    public List<User> getUser(Map<String, Object> condition);

    public List<User> getUserList();
}
