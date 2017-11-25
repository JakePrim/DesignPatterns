package com.linksu.android_kotlin_designpatterns.iterator_design.template;

/**
 * Created by suful on 2017/11/25.
 */

public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:" + request.getRequestLevel());
    }
}
