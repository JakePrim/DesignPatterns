package com.linksu.android_kotlin_designpatterns.prototypedesign;

import android.util.Log;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by suful on 2017/10/21.
 * 扮演 ConcretePrototype 具体的原型类  Cloneable 抽象类或接口 具备clone能力
 */

public class WordDocument implements Cloneable {
    private static final String TAG = "WordDocument";

    private String mText;

    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("WordDocument: 构造函数");
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addImage(String name) {
        mImages.add(name);
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        try {
            WordDocument document = (WordDocument) super.clone();
            document.mText = this.mText;
            /**
             * 对mImages 对象也调用clone（）函数，进深拷贝，不影响原始对象
             */
            document.mImages = (ArrayList<String>) this.mImages.clone();
            return document;
        } catch (Exception e) {

        }
        return null;
    }

    public void showDocument() {
        System.out.println("showDocument: text" + mText);
        for (String name : mImages) {
            System.out.println("showDocument: imageName" + name);
        }
    }
}
