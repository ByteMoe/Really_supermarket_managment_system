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

    // 检索水果并构造一个表格展示
    public void queryFruits() {
        String []thead = {"编号", "名称", "单价", "单位"};
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
        } else {  // 添加失败给出警告
            JOptionPane.showMessageDialog(this, "水果已经存在，添加失败！");  // 提示窗口类
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
        } else {  // 添加失败给出警告
            JOptionPane.showMessageDialog(this, "修改失败，请核对信息");  // 提示窗口类
        }
    }

    @Override
    public void delfruit() {
        String number = delAllText.getText();
        boolean modSucess = adminService.delFruit(number);
        if (modSucess) {
            queryFruits();
        } else {  // 删除失败给出警告
            JOptionPane.showMessageDialog(this, "删除失败！");  // 提示窗口类
        }
    }
}
