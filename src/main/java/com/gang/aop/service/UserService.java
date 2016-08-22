package com.gang.aop.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserService
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @Company: 伟业我爱我家
 * @Author GaoGang
 * @Date 2016-08-09 10:53
 * @Version V1.0
 */
public interface UserService<T> {
    public boolean addUser(T entity);

    public boolean editUser(T entity);

    public boolean deleteUser(String id);

    public List<T> getUser(Map<String, Object> condition);
}
