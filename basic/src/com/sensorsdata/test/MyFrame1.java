package com.sensorsdata.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame1 extends Frame implements MouseListener {
    public MyFrame1() throws HeadlessException {
        JFrame frame = new JFrame("鼠标事件测试");
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

        JButton button = new JButton("点我把");
        button.setBounds(0,0,50,50);
        button.addMouseListener(this);

        frame.getContentPane().add(button);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标移入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标移出");
    }
}
