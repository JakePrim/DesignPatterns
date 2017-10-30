package com.linksu.android_kotlin_designpatterns.singleton_design;

/**
 * Created by suful on 2017/10/30.
 * 静态内部类单例模式 推荐
 * 当第一次加载Singleton 类时并不会初始化singleton，只有在第一次调用getSingleton 才会导致singleton 被初始化
 * 第一次调用getSingleton方法，会导致虚拟机加载SingletonHolder 类，这种方式不仅能够确保线程安全，也能够保证单例对象的唯一性
 * ，同时也延迟了单例的实例化。推荐使用这种方式
 */

public class StaticSingleton {

    public static StaticSingleton getSingleton() {
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder {
        private static final StaticSingleton singleton = new StaticSingleton();
    }
}
