package com.linksu.kotlin_designpatterns.builderdesign

/**
 * Created by linksus on 8/23 0023.
 * 设置
 */
abstract class Computer {
    //设置主板
    data class setBoard(val mboard: String)

    //设置显示器
    data class setDisplay(val mDisplay: String)

    //设置操作系统
    public abstract fun setOS()
}