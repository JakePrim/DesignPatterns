package com.linksu.android_kotlin_designpatterns.decorative_design;

/**
 * Created by suful on 2017/10/29.
 * 便宜的衣服
 */

public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    private void dressShorts(){
        System.out.println("穿件短裤");
    }
    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
