package com.BigBigBigBigBigBigBigProject.dao;

import com.BigBigBigBigBigBigBigProject.data.DataBase;
import com.BigBigBigBigBigBigBigProject.data.FruitItem;

import java.util.ArrayList;

public class AdminDao {
    // ��ȡ������Ϣ
    public ArrayList<FruitItem> queryFruitItem() {
        return DataBase.dataArrayList;
    }

    // ������ݵ����ݿ�
    public void addFruitItem(FruitItem fruitItem) {
        DataBase.dataArrayList.add(fruitItem);
    }

    // �����ݿ��������Ϣ��ɾ���ض���Ϣ
    public void delFruitItem(String delNumber) {
        for (int i = 0; i < DataBase.dataArrayList.size(); i++) {  // �����������ݿ⣬�ҵ���������������
            FruitItem fruitItem = DataBase.dataArrayList.get(i);
            if (delNumber.equals(fruitItem.getNumber())) {
                DataBase.dataArrayList.remove(i);  // ɾ�������������ض���Ϣ
            }
        }
    }

    // �޸���������ض���Ϣ
    public void modFruitItem(FruitItem fruitItem) {
        DataBase.dataArrayList.add(fruitItem);
    }
}
