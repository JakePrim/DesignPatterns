package com.linksu.android_kotlin_designpatterns.iterator_design.template;

/**
 * Created by suful on 2017/11/25.
 */

public class Requset1 extends AbstractRequest {
    public Requset1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
