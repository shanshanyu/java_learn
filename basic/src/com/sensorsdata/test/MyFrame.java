package com.sensorsdata.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame  implements KeyListener {

    public MyFrame(){
        JFrame frame = new JFrame("小游戏");
        //设置窗口大小
        frame.setSize(500,500);
        //水平居中
        frame.setLocationRelativeTo(null);
        //布局为空
        frame.setLayout(null);
        //叉号退出
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //可见
        frame.setVisible(true);

        JButton jbt = new JButton("点一下");
        jbt.setBounds(0,0,50,50);

        //实现 ActionListener 的方法
        jbt.addKeyListener(this);


        frame.getContentPane().add(jbt);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("按下按键");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("松开按键了");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键了");
    }
    //实现一个键盘事件监听
}
