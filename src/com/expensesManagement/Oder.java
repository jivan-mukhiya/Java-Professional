package com.expensesManagement;

public class Oder {

    private String foodName;
    private int price;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Oder(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    public Oder() {
    }
}
