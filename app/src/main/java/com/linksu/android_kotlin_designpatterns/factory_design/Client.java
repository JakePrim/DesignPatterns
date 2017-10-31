package com.linksu.android_kotlin_designpatterns.factory_design;

import com.linksu.android_kotlin_designpatterns.factory_design.actualcombat.IOFactory;
import com.linksu.android_kotlin_designpatterns.factory_design.actualcombat.IOHandler;
import com.linksu.android_kotlin_designpatterns.factory_design.actualcombat.SharedHandler;

/**
 * Created by suful on 2017/10/30.
 */

public class Client {
    public static void main(String[] args) {
        Factory concreteFactory = new ConcreteFactory();
        Product product = concreteFactory.createProduct(ConcreteProductB.class);
        product.method();

        IOHandler handler = IOFactory.getIOHandler(SharedHandler.class);
        System.out.println("args =" + handler.query("1"));
    }
}
