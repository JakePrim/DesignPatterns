package com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat;

import java.io.Serializable;

/**
 * Created by suful on 2017/10/26.
 * 用户实体类
 */

public class User implements Cloneable, Serializable {
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    protected User clone() {
        User user = null;
        try {
            user = (User) super.clone();
            user.age = this.age;
            user.name = this.name;
            user.phoneNum = this.phoneNum;
            user.address = this.address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }
}
