package com.linksu.android_kotlin_designpatterns.iterator_design.template;

/**
 * Created by suful on 2017/11/25.
 */

public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler3 handle request:" + request.getRequestLevel());
    }
}
