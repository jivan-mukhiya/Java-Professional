package com.expensesManagement;

public class ExpensesPerHead {

    private String name;
    private int amountPerHead;
    private int paymentDeu;
    private int receivedDeu;


    public ExpensesPerHead(String name, int amount, int paymentDeu, int receivedDeu) {
        this.name = name;
        this.amountPerHead = amount;
        this.paymentDeu = paymentDeu;
        this.receivedDeu = receivedDeu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amountPerHead;
    }

    public void setAmount(int amount) {
        this.amountPerHead = amount;
    }

    public int getPaymentDeu() {
        return paymentDeu;
    }

    public void setPaymentDeu(int paymentDeu) {
        this.paymentDeu = paymentDeu;
    }

    public int getReceivedDeu() {
        return receivedDeu;
    }

    public void setReceivedDeu(int receivedDeu) {
        this.receivedDeu = receivedDeu;
    }
}
