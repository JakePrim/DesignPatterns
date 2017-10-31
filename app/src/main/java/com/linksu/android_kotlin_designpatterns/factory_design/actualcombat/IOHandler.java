package com.linksu.android_kotlin_designpatterns.factory_design.actualcombat;

/**
 * Created by suful on 2017/10/31.
 * 抽象产品类 ,抽象增删改查 四种操作类型
 */

public abstract class IOHandler {

    public abstract void add(String id, String name);

    public abstract void remove(String id);

    public abstract void update(String id, String name);

    public abstract String query(String id);

}
