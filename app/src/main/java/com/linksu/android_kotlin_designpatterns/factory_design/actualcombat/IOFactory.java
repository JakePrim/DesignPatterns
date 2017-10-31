package com.linksu.android_kotlin_designpatterns.factory_design.actualcombat;

/**
 * Created by suful on 2017/10/31.
 * IO 处理工厂
 */

public class IOFactory {
    public static <T extends IOHandler> T getIOHandler(Class<T> clz) {
        IOHandler ioHandler = null;
        try {
            ioHandler = (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) ioHandler;
    }
}
