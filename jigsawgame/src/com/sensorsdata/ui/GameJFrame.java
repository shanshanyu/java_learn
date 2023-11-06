package com.sensorsdata.ui;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {
    public GameJFrame() throws HeadlessException {
        //界面的宽高
        this.setSize(603,680);
        //设置标题
        this.setTitle("拼图小游戏v1.0");
        this.setAlwaysOnTop(true);
        //设置水平居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //显示界面
        this.setVisible(true);
    }
}
