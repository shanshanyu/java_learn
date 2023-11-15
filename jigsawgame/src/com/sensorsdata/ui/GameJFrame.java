package com.sensorsdata.ui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    public GameJFrame() throws HeadlessException {
        //把方法抽取出来，初始化界面
        initJFrame();

        //初始化菜单
        initJmenuBar();

        //初始化图片
        initImage();

        //显示界面
        this.setVisible(true);
    }

    private void initImage() {
        int[] s = new int[16];
        for(int i = 0; i < 16; i++)
            s[i] = i;

        int [][] s1 = shuffleImage(s);

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++) {

                JLabel jlabel = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\" +s1[i-1][j-1] + ".jpg"));
                jlabel.setBounds((j - 1) * 105,(i-1)*105,105,105);
                this.getContentPane().add(jlabel);
            }
        }

        /*JLabel jLabel1 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\1.jpg"));
        jLabel1.setBounds(0,0,105,105);
        this.getContentPane().add(jLabel1);

        JLabel jLabel2 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\2.jpg"));
        jLabel2.setBounds(105,0,105,105);
        this.getContentPane().add(jLabel2);

        JLabel jLabel3 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\3.jpg"));
        jLabel3.setBounds(210,0,105,105);
        this.getContentPane().add(jLabel3);

        JLabel jLabel4 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\4.jpg"));
        jLabel4.setBounds(315,0,105,105);
        this.getContentPane().add(jLabel4);

        JLabel jLabel5 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\5.jpg"));
        jLabel5.setBounds(0,105,105,105);
        this.getContentPane().add(jLabel5);

        JLabel jLabel6 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\6.jpg"));
        jLabel6.setBounds(105,105,105,105);
        this.getContentPane().add(jLabel6);

        JLabel jLabel7 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\7.jpg"));
        jLabel7.setBounds(210,105,105,105);
        this.getContentPane().add(jLabel7);

        JLabel jLabel8 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\8.jpg"));
        jLabel8.setBounds(315,105,105,105);
        this.getContentPane().add(jLabel8);

        JLabel jLabel9 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\9.jpg"));
        jLabel9.setBounds(0,210,105,105);
        this.getContentPane().add(jLabel9);

        JLabel jLabel10 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\10.jpg"));
        jLabel10.setBounds(105,210,105,105);
        this.getContentPane().add(jLabel10);

        JLabel jLabel11 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\11.jpg"));
        jLabel11.setBounds(210,210,105,105);
        this.getContentPane().add(jLabel11);

        JLabel jLabel12 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\12.jpg"));
        jLabel12.setBounds(315,210,105,105);
        this.getContentPane().add(jLabel12);

        JLabel jLabel13 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\13.jpg"));
        jLabel13.setBounds(0,315,105,105);
        this.getContentPane().add(jLabel13);


        JLabel jLabel14 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\14.jpg"));
        jLabel14.setBounds(105,315,105,105);
        this.getContentPane().add(jLabel14);

        JLabel jLabel15 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\15.jpg"));
        jLabel15.setBounds(210,315,105,105);
        this.getContentPane().add(jLabel15);

        JLabel jLabel16 = new JLabel(new ImageIcon("D:\\java_project\\java_learn\\jigsawgame\\image\\animal\\animal1\\16.jpg"));
        jLabel16.setBounds(315,315,105,105);
        this.getContentPane().add(jLabel16);*/
    }

    private void initJmenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

        JMenuItem changePicture = new JMenuItem("更换图片");
        JMenuItem reGame = new JMenuItem("重新游戏");
        JMenuItem reRegister = new JMenuItem("重新登录");
        JMenuItem closeGame = new JMenuItem("关闭游戏");

        //jmeuitem加入到jmenu中
        functionJmenu.add(changePicture);
        functionJmenu.add(reGame);
        functionJmenu.add(reRegister);
        functionJmenu.add(closeGame);

        //jmenu加入到jmenubar中
        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        //设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //界面的宽高
        this.setSize(603,680);
        //设置标题
        this.setTitle("拼图小游戏v1.0");
        this.setAlwaysOnTop(true);
        //设置水平居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //取消默认布局
        this.setLayout(null);
    }

    private int[][] shuffleImage(int[] s){
        Random r = new Random();
        int index;
        int tmp;
        for(int i=0; i < s.length; i++){
            index = r.nextInt(s.length);
            tmp = s[index];
            s[index] = s[i];
            s[i] = tmp;
        }

        int[][] s1 =  new int[4][4];
        for(int i = 0; i < s.length; i++){
            s1[i/4][i%4] = s[i];
        }
        return s1;
    }
}
