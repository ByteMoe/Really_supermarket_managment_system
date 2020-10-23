package com.BigBigBigBigBigBigBigProject.view;

import com.BigBigBigBigBigBigBigProject.tools.GUITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class MyJframe extends JFrame {

    private JLabel titlejlable = new JLabel(new ImageIcon("C:\\Users\\Badly\\Desktop\\Java\\src\\fruit.jpg"));  // ��ӭ�����ͼƬ
    private JButton button = new JButton("�������");  // ��ӭ����Ľ��밴ť

    public MyJframe() {  // ���췽�������ø��ַ���
        init();
        addComponent();
        addListener();
    }
    public void init() {  // ��ӭ����ĳ�ʼ��
        this.setTitle("����ǳ���");  // ���ñ���
        this.setSize(1210, 900);  // ���ô��ڿ��
        this.setResizable(false);
        GUITools.center(this);  //ʵ�ִ����Զ�����
        GUITools.setImage(this, "C:\\Users\\Badly\\Desktop\\Java\\src\\brand.jpg");  // ����ͼ��Icon
    }

    public void addComponent() {  // ����ӭ����������
        this.setLayout(new BorderLayout());
        this.add(titlejlable, BorderLayout.NORTH);
        button.setBounds(550, 5, 100, 50);  // ���ð�ť��λ�ü���С
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.add(button);
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void addListener() {  // ����ť����¼����������°�ťʱ��ת������Ա����
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdmin();  // ��ť����ʱִ��
            }
        });
    }

    public abstract void showAdmin();
}
