package com.sensorsdata.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest2 implements ActionListener {

    public JButtonTest2() {
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
        jbt.addActionListener(this);


        frame.getContentPane().add(jbt);


    }







    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了");
    }
}
