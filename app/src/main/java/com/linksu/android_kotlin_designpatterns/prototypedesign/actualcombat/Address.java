package com.linksu.android_kotlin_designpatterns.prototypedesign.actualcombat;

/**
 * Created by suful on 2017/10/26.
 * 用户地址类，存储地址的详细信息
 */

public class Address implements Cloneable {
    //城市
    public String city;
    //区
    public String district;
    //街道
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    protected Address clone() {
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
