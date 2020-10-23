package com.BigBigBigBigBigBigBigProject.data;

public class FruitItem {
    private String number;
    private String name;
    private double price;
    private String unit;

    // 有参和无参的构造方法
    public FruitItem() {

    }
    public FruitItem(String number, String name, double price, String unit) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    // 私有成员变量的 get 和 set 方法
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
