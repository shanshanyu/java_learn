package com.sensorsdata.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setTitle("button test");
        //设置始终放在顶层
        frame.setAlwaysOnTop(true);
        //设置界面居中
        frame.setLocationRelativeTo(null);
        //取消布局
        frame.setLayout(null);

        JButton button = new JButton("按一下");
        //设置按钮的位置和宽高
        button.setBounds(0,0,100,50);

        //添加ActionListener 对象，当事件触发后，执行 ActionListener 对象的 actionPerformed 方法
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了一下嘿嘿");
            }
        });

        frame.add(button);
        //frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
