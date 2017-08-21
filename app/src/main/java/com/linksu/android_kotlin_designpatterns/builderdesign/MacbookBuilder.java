package com.linksu.android_kotlin_designpatterns.builderdesign;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/21
 * 描 述：具体的builder类
 * 修订历史：
 * ==========================================
 */

public class MacbookBuilder extends Builder {

    private Computer computer = new Macbook();

    @Override
    public void buildBoard(String board) {
        computer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setOS();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
