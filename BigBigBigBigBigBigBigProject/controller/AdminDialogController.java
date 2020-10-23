package com.BigBigBigBigBigBigBigProject.controller;

import com.BigBigBigBigBigBigBigProject.data.DataBase;
import com.BigBigBigBigBigBigBigProject.data.FruitItem;
import com.BigBigBigBigBigBigBigProject.service.AdminService;
import com.BigBigBigBigBigBigBigProject.view.AdminDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class AdminDialogController extends AdminDialog {

    AdminService adminService = new AdminService();

    public AdminDialogController() {
        super();
        queryFruits();
    }

    public AdminDialogController(Frame owner, boolean modal) {
        super(owner, modal);
    }

    // ����ˮ��������һ�����չʾ
    public void queryFruits() {
        String []thead = {"���", "����", "����", "��λ"};
        ArrayList<FruitItem> data = DataBase.dataArrayList;
        String [][]tbody = listToArray(data);
        TableModel tableModel = new DefaultTableModel(tbody, thead);
        table.setModel(tableModel);
    }

    public String [][] listToArray(ArrayList<FruitItem> list) {
        String [][]tbody = new String[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            FruitItem fruitItem = list.get(i);
            tbody[i][0] = fruitItem.getNumber();
            tbody[i][1] = fruitItem.getName();
            tbody[i][2] = fruitItem.getPrice() + "";
            tbody[i][3] = fruitItem.getUnit();
        }
        return tbody;
    }

    @Override
    public void addfruit() {
        String number = addNumberText.getText();
        String name = addNameText.getText();
        String price = addPriceText.getText();
        String unit = addKgText.getText();
        boolean addSucess = adminService.addFruit(number, name, price, unit);
        if (addSucess) {
            queryFruits();
        } else {  // ���ʧ�ܸ�������
            JOptionPane.showMessageDialog(this, "ˮ���Ѿ����ڣ����ʧ�ܣ�");  // ��ʾ������
        }
    }

    @Override
    public void modfruit() {
        String number = updateNumbetText.getText();
        String name = updateNameText.getText();
        String price = updatePricetText.getText();
        String unit = updateKgtText.getText();
        boolean modSucess = adminService.modFruit(number, name, price, unit);
        if (modSucess) {
            queryFruits();
        } else {  // ���ʧ�ܸ�������
            JOptionPane.showMessageDialog(this, "�޸�ʧ�ܣ���˶���Ϣ");  // ��ʾ������
        }
    }

    @Override
    public void delfruit() {
        String number = delAllText.getText();
        boolean modSucess = adminService.delFruit(number);
        if (modSucess) {
            queryFruits();
        } else {  // ɾ��ʧ�ܸ�������
            JOptionPane.showMessageDialog(this, "ɾ��ʧ�ܣ�");  // ��ʾ������
        }
    }
}
