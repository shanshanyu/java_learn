package com.sensorsdata.ui;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //实例变量，记录二维数组的位置
    private int x;
    private int y;

    //二维数组
    int[][] s1 = new int[4][4];

    String path = "image\\animal\\animal1\\";

    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //定义count统计步数
    int step = 0;


    JMenuItem reGame = new JMenuItem("重新游戏");
    JMenuItem reRegister = new JMenuItem("重新登录");
    JMenuItem closeGame = new JMenuItem("关闭游戏");

    JMenuItem animalPic = new JMenuItem("动物图片");
    JMenuItem beautyPic = new JMenuItem("美女图片");
    JMenuItem sportPic = new JMenuItem("运动图片");

    public GameJFrame() throws HeadlessException {
        this.x = 0;
        this.y = 0;
        //把方法抽取出来，初始化界面
        initJFrame();

        //初始化菜单
        initJmenuBar();

        //打乱图片位置
        shuffleImage();

        //初始化图片
        initImage();

        //显示界面
        this.setVisible(true);
    }

    private void initImage() {
        //清空容器窗体
        this.getContentPane().removeAll();

        JLabel stepCount = new JLabel("步数:"+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        if(isSeq()){
            JLabel winJ = new JLabel(new ImageIcon("image\\win.png"));
            winJ.setBounds(203,283,197,73);
            this.getContentPane().add(winJ);
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                //这里的路径应该用相对路径
                JLabel jlabel = new JLabel(new ImageIcon(path +s1[i][j] + ".jpg"));
                jlabel.setBounds(j * 105+83,i*105+134,105,105);
                //添加边框
                jlabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jlabel);
            }
        }

        //先加载的图片在上方，后加载的在下方
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        //重新渲染
        this.getContentPane().repaint();
    }

    private void initJmenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");
        JMenu changePicture = new JMenu("更换图片"); //更换图片有子选项，更换图片也要用 jmenu，子选项用jmenuitem

        reGame.addActionListener(this);
        reRegister.addActionListener(this);
        closeGame.addActionListener(this);

        beautyPic.addActionListener(this);
        sportPic.addActionListener(this);
        animalPic.addActionListener(this);

        //jmeuitem加入到jmenu中
        functionJmenu.add(changePicture);
        functionJmenu.add(reGame);
        functionJmenu.add(reRegister);
        functionJmenu.add(closeGame);

        changePicture.add(beautyPic);
        changePicture.add(sportPic);
        changePicture.add(animalPic);

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

        //添加键盘监听事件
        this.addKeyListener(this);
    }

    private void shuffleImage(){
        int[] s = new int[16];
        for(int i = 0; i < 16; i++)
            s[i] = i;

        Random r = new Random();
        int index;
        int tmp;
        //打乱一维数组
        for(int i=0; i < s.length; i++){
            index = r.nextInt(s.length);
            tmp = s[index];
            s[index] = s[i];
            s[i] = tmp;
        }


        for(int i = 0; i < s.length; i++){
            //记录0的位置
            if(s[i] == 0){
                this.x = i/4;
                this.y = i%4;
                s1[i/4][i%4] = 0;
            }else{
                s1[i/4][i%4] = s[i];
            }

        }
    }

    private void displayFullImage(){
        //清空容器窗体
        this.getContentPane().removeAll();

        JLabel jlabel = new JLabel(new ImageIcon(path+"all.jpg"));
        jlabel.setBounds(83,134,420,420);
        //添加边框
        jlabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        this.getContentPane().add(jlabel);

        //先加载的图片在上方，后加载的在下方
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        //重新渲染
        this.getContentPane().repaint();
    }

    //判断二维数组是否有序
    private boolean isSeq(){
        boolean flag = true;

        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                if(s1[i][j] != win[i][j]){
                    flag = false;
                    return flag;
                }
        return flag;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(isSeq())
            return ;
        int code = e.getKeyCode();
        if(code == 80)
            displayFullImage();
        else if(code == 87){
            s1 = win;
            initImage();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(isSeq())
            return ;
        //左：37，上：38，右：39，下：40
        int code = e.getKeyCode();
        switch(code){
            case 37: //左
                int y1 = (y+1)==4 ? y : (y+1);
                s1[x][y] = s1[x][y1];
                s1[x][y1] = 0;
                y = (y+1==4) ? y : (y+1);

                initImage();
                step++;
                break;

            case 38: //上
                //数字交换换成后，图片怎么显示？
                // initImage()

                int x1 = (x+1)==4 ? x : (x+1);
                s1[x][y] = s1[x1][y];
                s1[x1][y] = 0;
                x = (x+1==4) ? x : (x+1);

                initImage();
                step++;
                break;

            case 39:
                int y2 = (y-1)==-1 ? y : (y-1);
                s1[x][y] = s1[x][y2];
                s1[x][y2] = 0;
                y = (y-1==-1) ? y : (y-1);

                initImage();
                step++;
                break;
            case 40:
                int x2 = (x-1)==-1 ? x : (x-1);
                s1[x][y] = s1[x2][y];
                s1[x2][y] = 0;
                x = (x-1==-1) ? x : (x-1);

                initImage();
                step++;
                break;
            case 80:
                initImage();
                break;
            default:
                System.out.println("未知按键");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == reGame){
            step++;
            shuffleImage();
            initImage();
        }else if(obj == reRegister){
            //关闭当前界面
            this.setVisible(false);
            //显示登录界面
            new LoginJFrame();

        }else if(obj == beautyPic) {
            Random r = new Random();
            int num = r.nextInt(13)+1; //1 到 13 之间生成一个数
            path = "image\\girl\\girl"+num+"\\";
            step = 0;
            shuffleImage();
            initImage();

        }else if(obj == animalPic) {
            Random r = new Random();
            int num = r.nextInt(8)+1; //1 到 13 之间生成一个数
            path = "image\\animal\\animal"+num+"\\";
            step = 0;
            shuffleImage();
            initImage();

        }else if(obj == sportPic) {
            Random r = new Random();
            int num = r.nextInt(10)+1; //1 到 13 之间生成一个数
            path = "image\\sport\\sport"+num+"\\";
            step = 0;
            shuffleImage();
            initImage();


        }else if(obj == closeGame){
            //关闭游戏
            System.exit(0);
        }
    }
}
