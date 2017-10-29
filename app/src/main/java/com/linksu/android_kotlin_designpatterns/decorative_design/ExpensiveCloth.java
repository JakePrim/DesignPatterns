package com.linksu.android_kotlin_designpatterns.decorative_design;

/**
 * Created by suful on 2017/10/29.
 * 高档的衣服
 */

public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }

    private void dressShirt() {
        System.out.println("穿件短袖");
    }

    private void dressLeather() {
        System.out.println("穿件皮衣");
    }

    private void dressJean() {
        System.out.println("穿件牛仔裤");
    }
}
