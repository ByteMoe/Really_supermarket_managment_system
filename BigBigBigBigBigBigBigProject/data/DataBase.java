package com.BigBigBigBigBigBigBigProject.data;

import java.util.ArrayList;

// ģ�����ݿ���
public class DataBase {
    public static ArrayList<FruitItem> dataArrayList = new ArrayList<FruitItem>();
    static {
        dataArrayList.add(new FruitItem("1", "ƻ��", 5.9, "KG"));
        dataArrayList.add(new FruitItem("2", "����", 7.8, "KG"));
        dataArrayList.add(new FruitItem("3", "��ݮ", 19.9, "G"));
    }
}

// ���ݿ������ ��Dao���ࡱ  һ���ӿڣ��ṩ�˷������ݵĽӿ�
// data access object

