package com.linksu.android_kotlin_designpatterns.builderdesign;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/21
 * 描 述：具体的Computer 实现类
 * 修订历史：
 * ==========================================
 */

public class Macbook extends Computer {
    @Override
    public void setOS() {
        mOS = "Mac OS X 10.10";
    }

    protected Macbook() {
    }
}
