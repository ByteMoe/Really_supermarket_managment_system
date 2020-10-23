package com.BigBigBigBigBigBigBigProject.data;

import java.util.ArrayList;

// 模拟数据库类
public class DataBase {
    public static ArrayList<FruitItem> dataArrayList = new ArrayList<FruitItem>();
    static {
        dataArrayList.add(new FruitItem("1", "苹果", 5.9, "KG"));
        dataArrayList.add(new FruitItem("2", "葡萄", 7.8, "KG"));
        dataArrayList.add(new FruitItem("3", "草莓", 19.9, "G"));
    }
}

// 数据库访问类 “Dao层类”  一个接口，提供了访问数据的接口
// data access object

