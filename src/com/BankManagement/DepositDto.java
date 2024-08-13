package com.BankManagement;

public class DepositDto {
    private String bankAccountNumber;
    private double depositAmount;
    private String accountHolderName;

    public DepositDto(String bankAccountNumber, double depositAmount, String accountHolderName) {
        this.bankAccountNumber = bankAccountNumber;
        this.depositAmount = depositAmount;
        this.accountHolderName = accountHolderName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
