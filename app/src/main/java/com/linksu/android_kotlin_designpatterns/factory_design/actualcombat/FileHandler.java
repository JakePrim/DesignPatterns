package com.linksu.android_kotlin_designpatterns.factory_design.actualcombat;

/**
 * Created by suful on 2017/10/31.
 * 对文件类型的处理
 */

public class FileHandler extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {
       return "File";
    }
}
