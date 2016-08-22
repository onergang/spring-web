package com.gang.aop.po;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @Company: 伟业我爱我家
 * @Author GaoGang
 * @Date 2016-08-09 10:51
 * @Version V1.0
 */
public class User implements Serializable {
    private Integer id;
    private String userName;
    private Integer age;
    private String sex;
    private String address;

    public User() {
    }

    public User(Integer id, String userName, Integer age, String sex, String address) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
