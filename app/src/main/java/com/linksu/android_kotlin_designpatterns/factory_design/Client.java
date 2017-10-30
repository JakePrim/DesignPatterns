package com.linksu.android_kotlin_designpatterns.factory_design;

/**
 * Created by suful on 2017/10/30.
 */

public class Client {
    public static void main(String[] args) {
        Factory concreteFactory = new ConcreteFactory();
        Product product = concreteFactory.createProduct(ConcreteProductB.class);
        product.method();
    }
}
