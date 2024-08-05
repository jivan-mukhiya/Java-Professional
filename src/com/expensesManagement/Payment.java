package com.expensesManagement;

public class Payment {

    private String name;
    private int paymentAmount;

    public Payment(String name, int paymentAmount) {
        this.name = name;
        this.paymentAmount = paymentAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
