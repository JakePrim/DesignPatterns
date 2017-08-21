package com.linksu.android_kotlin_designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import design.android.linksu.com.linksuimglib.DoubleCache;
import design.android.linksu.com.linksuimglib.Links;
import design.android.linksu.com.linksuimglib.MemoryCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.image_links);
        Links link = Links.getLink();
        link.setImageCache(new MemoryCache());
        link.intoImage("http://img2.imgtn.bdimg.com/it/u=1624300554,469369982&fm=26&gp=0.jpg", imageView);
    }
}
