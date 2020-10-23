package com.BigBigBigBigBigBigBigProject.view;

import com.BigBigBigBigBigBigBigProject.tools.GUITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 继承自对话式窗口类（Dialog），需要依附在主窗口上，随主窗口关闭而关闭
public abstract class AdminDialog extends Dialog {

    private JLabel tableJlabel = new JLabel("真的是水果超市");  // 表格标题
    protected JTable table = new JTable();  // 表添加到table中
    protected JScrollPane jScrollPane = new JScrollPane();  // 滚动窗口

    // 四个标题用于提示文本框输入
    private JLabel numberjlabel = new JLabel("水果编号");
    private JLabel namejlabel = new JLabel("水果名称");
    private JLabel pricejlabel = new JLabel("水果单价");
    private JLabel kgjlabel = new JLabel("水果单位");

    // 添加水果
    protected JTextField addNumberText = new JTextField();
    protected JTextField addNameText = new JTextField();
    protected JTextField addPriceText = new JTextField();
    protected JTextField addKgText = new JTextField();
    private JButton addjbutton = new JButton("添加水果");

    // 修改水果
    protected JTextField updateNumbetText = new JTextField();
    protected JTextField updateNameText = new JTextField();
    protected JTextField updatePricetText = new JTextField();
    protected JTextField updateKgtText = new JTextField();
    private JButton modjbutton = new JButton("修改水果");

    // 删除水果
    protected JTextField delAllText = new JTextField();
    private JButton deljbutton = new JButton("删除水果");

    public AdminDialog(Frame owner, boolean modal) {
        super(owner, modal);
    }

    public AdminDialog() {
        super(null, true);
        init();
        addComponent();
        addListener();
    }

    public void init() {  // 初始化管理界面（标题及图标）
        this.setTitle("真的是超市管理界面");
        this.setSize(600, 500);
        GUITools.center(this);
        GUITools.setImage(this, "C:\\Users\\Badly\\Desktop\\Java\\src\\brand.jpg");
    }

    public void addComponent() {  // 添加组件
        this.setLayout(null);
        tableJlabel.setBounds(275, 0, 92, 100);
        this.add(tableJlabel);
        jScrollPane.setBounds(50, 60, 500, 170);
        jScrollPane.setViewportView(table);  // 将括号内的视图模块参数添加到点前面的视图模块中去
        this.add(jScrollPane);

        // 添加四个提示到窗口上
        numberjlabel.setBounds(50, 250, 70, 25);
        namejlabel.setBounds(150, 250, 70, 25);
        pricejlabel.setBounds(250, 250, 70, 25);
        kgjlabel.setBounds(350, 250, 70, 25);
        this.add(numberjlabel);
        this.add(namejlabel);
        this.add(pricejlabel);
        this.add(kgjlabel);

        // 添加 添加水果 文本框和按钮到窗口
        addNumberText.setBounds(50, 280, 80, 25);
        addNameText.setBounds(150, 280, 80, 25);
        addPriceText.setBounds(250, 280, 80, 25);
        addKgText.setBounds(350, 280, 80, 25);
        addjbutton.setBounds(470, 280, 90, 25);
        add(addNumberText);
        add(addNameText);
        add(addPriceText);
        add(addKgText);
        this.add(addjbutton);

        // 添加 修改水果 文本框和按钮到窗口
        updateNumbetText.setBounds(50, 310, 80, 25);
        updateNameText.setBounds(150, 310, 80, 25);
        updatePricetText.setBounds(250, 310, 80, 25);
        updateKgtText.setBounds(350, 310, 80, 25);
        modjbutton.setBounds(470, 310, 90, 25);
        add(updateNumbetText);
        add(updateNameText);
        add(updatePricetText);
        add(updateKgtText);
        add(modjbutton);

        // 添加 删除水果 文本框和按钮到窗口
        delAllText.setBounds(50, 340, 80, 25);
        deljbutton.setBounds(470, 340, 90, 25);
        add(delAllText);
        add(deljbutton);
    }

    // 给三个按钮添加事件监听
    public void addListener() {
        // 添加水果的按钮事件监听
        addjbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addfruit();
            }
        });

        // 修改水果的按钮事件监听
        modjbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modfruit();
            }
        });

        // 删除水果的按钮事件监听
        deljbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delfruit();
            }
        });
    }

    public abstract void addfruit();
    public abstract void modfruit();
    public abstract void delfruit();
}
