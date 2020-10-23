package com.BigBigBigBigBigBigBigProject.service;

import com.BigBigBigBigBigBigBigProject.dao.AdminDao;
import com.BigBigBigBigBigBigBigProject.data.FruitItem;
import com.BigBigBigBigBigBigBigProject.view.AdminDialog;

import java.util.ArrayList;

// ����Ա������
public class AdminService {
    // ʵ����������ɾ�Ĳ�

    private AdminDao adminDao = new AdminDao();

    // ��ȡ������Ϣ
    public ArrayList<FruitItem> queryFruit() {
        return adminDao.queryFruitItem();
    }

    // ���ˮ��
    public boolean addFruit(String number, String name, String price, String unit) {
        ArrayList<FruitItem> data = queryFruit();
        for (int i = 0; i < data.size(); i++) {  // �����������ÿ��ˮ��
            FruitItem fruitItem = data.get(i);
            if (number.equals(fruitItem.getNumber())) {  // ����������˵��ˮ���Ѿ��������ݿ���
                return false;
            }
        }
        FruitItem thisFruitItem = new FruitItem(number, name, Double.parseDouble(price), unit);
        adminDao.addFruitItem(thisFruitItem);
        return true;
    }

    // �޸�ˮ��
    public boolean modFruit(String number, String name, String price, String unit) {
        ArrayList<FruitItem> data = queryFruit();
        for (int i = 0; i < data.size(); i++) {  // �����������ÿ��ˮ��
            FruitItem fruitItem = data.get(i);
            if (number.equals(fruitItem.getNumber())) {  // ����������˵��ˮ���Ѿ��������ݿ���
                adminDao.delFruitItem(number);
                FruitItem thisFruitItem = new FruitItem(number, name, Double.parseDouble(price), unit);
                adminDao.addFruitItem(thisFruitItem);
                return true;
            }
        }
        return false;
    }

    // ɾ��ˮ��
    public boolean delFruit(String number) {
        ArrayList<FruitItem> data = queryFruit();
        for (int i = 0; i < data.size(); i++) {  // �����������ÿ��ˮ��
            FruitItem fruitItem = data.get(i);
            if (number.equals(fruitItem.getNumber())) {  // ����������˵��ˮ���Ѿ��������ݿ���
                adminDao.delFruitItem(number);
                return true;
            }
        }
        return false;
    }

}
