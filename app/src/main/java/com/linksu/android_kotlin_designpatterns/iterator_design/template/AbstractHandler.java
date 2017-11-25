package com.linksu.android_kotlin_designpatterns.iterator_design.template;

/**
 * Created by suful on 2017/11/25.
 * 抽象处理者
 */

public abstract class AbstractHandler {
    public AbstractHandler nextHandler;

    /**
     * 处理请求
     *
     * @param request 请求对象
     */
    public final void handlerRequest(AbstractRequest request) {
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handlerRequest(request);
            } else {
                System.out.println("All of handler can not handle the request");
            }
        }
    }

    /**
     * 获取处理对象的请求级别
     *
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理对象的具体处理方式
     *
     * @param request 请求者对象
     */
    protected abstract void handle(AbstractRequest request);
}
