package com.BankManagement;

public class WithdrawDto {

    private String bankAccountNumber;
    private double withdrawAmount;
    private String accountHolderName;

    public WithdrawDto(String bankAccountNumber, double withdrawAmount, String accountHolderName) {
        this.bankAccountNumber = bankAccountNumber;
        this.withdrawAmount = withdrawAmount;
        this.accountHolderName = accountHolderName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
