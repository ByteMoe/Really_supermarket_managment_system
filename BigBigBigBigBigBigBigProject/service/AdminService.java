package com.BigBigBigBigBigBigBigProject.service;

import com.BigBigBigBigBigBigBigProject.dao.AdminDao;
import com.BigBigBigBigBigBigBigProject.data.FruitItem;
import com.BigBigBigBigBigBigBigProject.view.AdminDialog;

import java.util.ArrayList;

// 管理员服务类
public class AdminService {
    // 实现真正的增删改查

    private AdminDao adminDao = new AdminDao();

    // 获取所有信息
    public ArrayList<FruitItem> queryFruit() {
        return adminDao.queryFruitItem();
    }

    // 添加水果
    public boolean addFruit(String number, String name, String price, String unit) {
        ArrayList<FruitItem> data = queryFruit();
        for (int i = 0; i < data.size(); i++) {  // 检索集合里的每个水果
            FruitItem fruitItem = data.get(i);
            if (number.equals(fruitItem.getNumber())) {  // 条件成立则说明水果已经存在数据库里
                return false;
            }
        }
        FruitItem thisFruitItem = new FruitItem(number, name, Double.parseDouble(price), unit);
        adminDao.addFruitItem(thisFruitItem);
        return true;
    }

    // 修改水果
    public boolean modFruit(String number, String name, String price, String unit) {
        ArrayList<FruitItem> data = queryFruit();
        for (int i = 0; i < data.size(); i++) {  // 检索集合里的每个水果
            FruitItem fruitItem = data.get(i);
            if (number.equals(fruitItem.getNumber())) {  // 条件成立则说明水果已经存在数据库里
                adminDao.delFruitItem(number);
                FruitItem thisFruitItem = new FruitItem(number, name, Double.parseDouble(price), unit);
                adminDao.addFruitItem(thisFruitItem);
                return true;
            }
        }
        return false;
    }

    // 删除水果
    public boolean delFruit(String number) {
        ArrayList<FruitItem> data = queryFruit();
        for (int i = 0; i < data.size(); i++) {  // 检索集合里的每个水果
            FruitItem fruitItem = data.get(i);
            if (number.equals(fruitItem.getNumber())) {  // 条件成立则说明水果已经存在数据库里
                adminDao.delFruitItem(number);
                return true;
            }
        }
        return false;
    }

}
