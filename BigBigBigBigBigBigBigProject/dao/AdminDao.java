package com.BigBigBigBigBigBigBigProject.dao;

import com.BigBigBigBigBigBigBigProject.data.DataBase;
import com.BigBigBigBigBigBigBigProject.data.FruitItem;

import java.util.ArrayList;

public class AdminDao {
    // 获取所有信息
    public ArrayList<FruitItem> queryFruitItem() {
        return DataBase.dataArrayList;
    }

    // 添加数据到数据库
    public void addFruitItem(FruitItem fruitItem) {
        DataBase.dataArrayList.add(fruitItem);
    }

    // 在数据库里检索信息并删除特定信息
    public void delFruitItem(String delNumber) {
        for (int i = 0; i < DataBase.dataArrayList.size(); i++) {  // 遍历整个数据库，找到符合条件的数据
            FruitItem fruitItem = DataBase.dataArrayList.get(i);
            if (delNumber.equals(fruitItem.getNumber())) {
                DataBase.dataArrayList.remove(i);  // 删除检索出来的特定信息
            }
        }
    }

    // 修改数据里的特定信息
    public void modFruitItem(FruitItem fruitItem) {
        DataBase.dataArrayList.add(fruitItem);
    }
}
