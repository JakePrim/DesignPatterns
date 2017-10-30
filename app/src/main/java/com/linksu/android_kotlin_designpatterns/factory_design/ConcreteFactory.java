package com.linksu.android_kotlin_designpatterns.factory_design;

/**
 * Created by suful on 2017/10/30.
 * 具体的工厂类
 */

public class ConcreteFactory extends Factory {

    /**
     * 通过反射获取类
     * @param clz
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
