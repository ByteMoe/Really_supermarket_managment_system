package com.BigBigBigBigBigBigBigProject.view;

import com.BigBigBigBigBigBigBigProject.tools.GUITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class MyJframe extends JFrame {

    private JLabel titlejlable = new JLabel(new ImageIcon("C:\\Users\\Badly\\Desktop\\Java\\src\\fruit.jpg"));  // 欢迎界面的图片
    private JButton button = new JButton("点击进入");  // 欢迎界面的进入按钮

    public MyJframe() {  // 构造方法，调用各种方法
        init();
        addComponent();
        addListener();
    }
    public void init() {  // 欢迎界面的初始化
        this.setTitle("真的是超市");  // 设置标题
        this.setSize(1210, 900);  // 设置窗口宽高
        this.setResizable(false);
        GUITools.center(this);  //实现窗口自动居中
        GUITools.setImage(this, "C:\\Users\\Badly\\Desktop\\Java\\src\\brand.jpg");  // 设置图标Icon
    }

    public void addComponent() {  // 给欢迎界面添加组件
        this.setLayout(new BorderLayout());
        this.add(titlejlable, BorderLayout.NORTH);
        button.setBounds(550, 5, 100, 50);  // 设置按钮的位置及大小
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.add(button);
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void addListener() {  // 给按钮添加事件监听，按下按钮时跳转到管理员界面
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdmin();  // 按钮按下时执行
            }
        });
    }

    public abstract void showAdmin();
}
