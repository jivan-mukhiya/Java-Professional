package com.BankManagement;

public class BalanceTransferDto {

    private String receiverAccountNumber;
    private String senderAccountNumber;
    private double transferAmount;

    public BalanceTransferDto(String receiverAccountNumber, String senderAccountNumber, double transferAmount) {
        this.receiverAccountNumber = receiverAccountNumber;
        this.senderAccountNumber = senderAccountNumber;
        this.transferAmount = transferAmount;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(String receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(String senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }
}
