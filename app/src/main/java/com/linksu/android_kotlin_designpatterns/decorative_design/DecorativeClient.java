package com.linksu.android_kotlin_designpatterns.decorative_design;

/**
 * Created by suful on 2017/10/29.
 * 装饰模式
 */

public class DecorativeClient {

    public static void main(String[] args) {
        /**
         * 首先我们要有一个男孩
         */
        Person person = new Boy();

        /*
        * 然后为他穿上便宜的衣服
        * */
        PersonCloth personCloth = new CheapCloth(person);
        personCloth.dressed();

        /*或者给他穿上高档的衣服*/
        PersonCloth personCloth1 = new ExpensiveCloth(person);
        personCloth1.dressed();
    }

}
