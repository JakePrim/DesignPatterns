package com.linksu.android_kotlin_designpatterns.decorative_design;

/**
 * Created by suful on 2017/10/29.
 * (Boy) 类使我们所要装饰的具体对象，PersonCloth (装饰者)来装饰我们的这个Boy对象
 * <p>
 * 人所穿着的衣服
 */

public abstract class PersonCloth extends Person {
    protected Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        /**
         * 调用person类中的dressed（）/方法
         */
        person.dressed();
    }
}
