package com.sensorsdata.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements ActionListener {
    //类变量
    static ArrayList<User> list = new ArrayList<>();
    //静态代码块 只在类加载的时候执行一次
    static{
        list.add(new User("zhangsan","1234"));
        list.add(new User("lisi","1234"));
    }


    //用户名输入框
    JTextField username = new JTextField();

    //密码输入框
    JPasswordField pass = new JPasswordField();

    //验证码
    String codeStr = RandomCodeGenerator.getCode(5);

    //登录
    JButton  loginText = new JButton();
    //注册
    JButton registerText = new JButton();

    //验证码
    JLabel verifyCode = new JLabel(codeStr);

    public LoginJFrame() throws HeadlessException {
        initJFrame();
        initImage();

        //设置可见
        this.setVisible(true);
    }

    private void initJFrame(){
        //设置大小
        this.setSize(603,680);
        //设置标题
        this.setTitle("拼图游戏 v1.0 登录");
        //设置保持在前台
        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //取消默认布局
        this.setLayout(null);
    }

    private void initImage(){
        //清空容器窗体
        this.getContentPane().removeAll();

        //用户名图片
        JLabel usernameText = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        usernameText.setBounds(116,200,47,17);
        this.getContentPane().add(usernameText);


        username.setBounds(195,200,200,30);
        this.getContentPane().add(username);

        //密码图片
        JLabel passText = new JLabel(new ImageIcon("image\\login\\密码.png"));
        passText.setBounds(116,250,32,16);
        this.getContentPane().add(passText);


        pass.setBounds(195,250,200,30);
        this.getContentPane().add(pass);

        //验证码图片
        JLabel verifyText = new JLabel(new ImageIcon("image\\login\\验证码.png"));
        verifyText.setBounds(116,300,56,21);
        this.getContentPane().add(verifyText);

        //验证码文本框
        JTextField verify = new JTextField();
        verify.setBounds(195,300,100,30);
        this.getContentPane().add(verify);


        verifyCode.setBounds(300,300,50,30);
        this.getContentPane().add(verifyCode);

        //登录按钮
        loginText.setIcon(new ImageIcon("image\\login\\登录按钮.png"));

        loginText.setBounds(116,350,128,47);
        //去除按钮默认背景
        loginText.setContentAreaFilled(false);
        //去除按钮的默认边框
        loginText.setBorderPainted(false);
        this.getContentPane().add(loginText);
        //绑定点击事件
        loginText.addActionListener(this);

        //注册按钮
        registerText.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        registerText.setBounds(280,350,128,47);
        //去除按钮默认背景
        registerText.setContentAreaFilled(false);
        //去除按钮的默认边框
        registerText.setBorderPainted(false);
        this.getContentPane().add(registerText);
        //绑定点击事件
        registerText.addActionListener(this);


        //先加载的图片在上方，后加载的在下方
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        //重新渲染
        this.getContentPane().repaint();
    }

    private void showDialog(String content){
        //创建弹框对象
        JDialog dialog = new JDialog();
        //设置弹框大小
        dialog.setSize(200,100);
        //弹框置顶
        dialog.setAlwaysOnTop(true);
        //弹框居中
        dialog.setLocationRelativeTo(null);
        //弹框不关闭无法操作下面的界面
        dialog.setModal(true);

        //创建jlabel添加到弹框中
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        dialog.getContentPane().add(warning);

        //弹框显示出来
        dialog.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == loginText){
            loginText.setIcon(new ImageIcon("image\\login\\登录按下.png"));
            String inputUser = username.getText();
            String inputPass = String.valueOf(pass.getPassword());
            if(inputUser.equals("zhangsan") && inputPass.equals("1234")){
                new GameJFrame();
                this.setVisible(false);
            }else{
                showDialog("用户名或密码不正确");
            }
        }else if(obj == registerText){
            registerText.setIcon(new ImageIcon("image\\login\\注册按下.png"));
        }
    }
}
