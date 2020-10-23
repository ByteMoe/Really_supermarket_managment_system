package com.BigBigBigBigBigBigBigProject.view;

import com.BigBigBigBigBigBigBigProject.tools.GUITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �̳��ԶԻ�ʽ�����ࣨDialog������Ҫ�������������ϣ��������ڹرն��ر�
public abstract class AdminDialog extends Dialog {

    private JLabel tableJlabel = new JLabel("�����ˮ������");  // ������
    protected JTable table = new JTable();  // ����ӵ�table��
    protected JScrollPane jScrollPane = new JScrollPane();  // ��������

    // �ĸ�����������ʾ�ı�������
    private JLabel numberjlabel = new JLabel("ˮ�����");
    private JLabel namejlabel = new JLabel("ˮ������");
    private JLabel pricejlabel = new JLabel("ˮ������");
    private JLabel kgjlabel = new JLabel("ˮ����λ");

    // ���ˮ��
    protected JTextField addNumberText = new JTextField();
    protected JTextField addNameText = new JTextField();
    protected JTextField addPriceText = new JTextField();
    protected JTextField addKgText = new JTextField();
    private JButton addjbutton = new JButton("���ˮ��");

    // �޸�ˮ��
    protected JTextField updateNumbetText = new JTextField();
    protected JTextField updateNameText = new JTextField();
    protected JTextField updatePricetText = new JTextField();
    protected JTextField updateKgtText = new JTextField();
    private JButton modjbutton = new JButton("�޸�ˮ��");

    // ɾ��ˮ��
    protected JTextField delAllText = new JTextField();
    private JButton deljbutton = new JButton("ɾ��ˮ��");

    public AdminDialog(Frame owner, boolean modal) {
        super(owner, modal);
    }

    public AdminDialog() {
        super(null, true);
        init();
        addComponent();
        addListener();
    }

    public void init() {  // ��ʼ��������棨���⼰ͼ�꣩
        this.setTitle("����ǳ��й������");
        this.setSize(600, 500);
        GUITools.center(this);
        GUITools.setImage(this, "C:\\Users\\Badly\\Desktop\\Java\\src\\brand.jpg");
    }

    public void addComponent() {  // ������
        this.setLayout(null);
        tableJlabel.setBounds(275, 0, 92, 100);
        this.add(tableJlabel);
        jScrollPane.setBounds(50, 60, 500, 170);
        jScrollPane.setViewportView(table);  // �������ڵ���ͼģ�������ӵ���ǰ�����ͼģ����ȥ
        this.add(jScrollPane);

        // ����ĸ���ʾ��������
        numberjlabel.setBounds(50, 250, 70, 25);
        namejlabel.setBounds(150, 250, 70, 25);
        pricejlabel.setBounds(250, 250, 70, 25);
        kgjlabel.setBounds(350, 250, 70, 25);
        this.add(numberjlabel);
        this.add(namejlabel);
        this.add(pricejlabel);
        this.add(kgjlabel);

        // ��� ���ˮ�� �ı���Ͱ�ť������
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

        // ��� �޸�ˮ�� �ı���Ͱ�ť������
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

        // ��� ɾ��ˮ�� �ı���Ͱ�ť������
        delAllText.setBounds(50, 340, 80, 25);
        deljbutton.setBounds(470, 340, 90, 25);
        add(delAllText);
        add(deljbutton);
    }

    // ��������ť����¼�����
    public void addListener() {
        // ���ˮ���İ�ť�¼�����
        addjbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addfruit();
            }
        });

        // �޸�ˮ���İ�ť�¼�����
        modjbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modfruit();
            }
        });

        // ɾ��ˮ���İ�ť�¼�����
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
