package com.BankManagement;

import java.util.List;
import java.util.Scanner;

public class AccountFunction extends Util{

    public DepositDto deposit(List<Account> accountList,DepositDto depositDto){

        if(depositDto.getBankAccountNumber()==null){
            System.out.println("Account number is null !!");
        }
      Account accountMatch=accountMatcher(accountList,depositDto.getBankAccountNumber());
      if(depositDto.getBankAccountNumber().equals(accountMatch.getAccountNumber())){
          if(depositDto.getDepositAmount()>=1000){
              if(depositDto.getAccountHolderName()!=null){
                  accountMatch.setBalance(accountMatch.getBalance()+depositDto.getDepositAmount());
                  transaction(accountMatch,"Deposit",depositDto.getDepositAmount());
                  updateAccount(accountMatch);
                  System.out.println("Dear "+accountMatch.getAccountHolderName()+",\nDeposit Successfully rs."
                          +depositDto.getDepositAmount()+"\n" +
                          "Account Number "+accountMatch.getAccountNumber());

              }else{
                  System.out.println("Account holder name is null !!");

              }
          }else {
              System.out.println(" Insufficient balance !!");
          }
      }else {
          System.out.println("Account number is not match !!");
      }
      return depositDto;
    }

public WithdrawDto withdraw(List<Account> accountList,WithdrawDto  withdrawDto){

        if(withdrawDto.getBankAccountNumber()==null){
            System.out.println("Account number is null !!");
        }
        Account accountMatch=accountMatcher(accountList,withdrawDto.getBankAccountNumber());
        if(withdrawDto.getBankAccountNumber().equals(accountMatch.getAccountNumber())){
            if(accountMatch.getBalance()>=1000 && withdrawDto.getWithdrawAmount()>=1000){
                if (accountMatch.getAccountHolderName()!=null){
                    accountMatch.setBalance(accountMatch.getBalance()-withdrawDto.getWithdrawAmount());
                    transaction(accountMatch,"Withdraw",withdrawDto.getWithdrawAmount());
                    updateAccount(accountMatch);
                    System.out.println("Dear "+accountMatch.getAccountHolderName()+",\nWithdraw Successfully rs."+withdrawDto.getWithdrawAmount()+"\n" +
                            "Account Number "+accountMatch.getAccountNumber());

                }else {
                    System.out.println("Account holder name is null !!");
                }
            }else {
                System.out.println(" Insufficient balance !!");
            }
        }else {
            System.out.println(" account number is not match !!");
        }
        return withdrawDto;
}

public BalanceTransferDto balanceTransfer(List<Account> accountList,BalanceTransferDto transferDto){

        if(transferDto.getReceiverAccountNumber() ==null && transferDto.getSenderAccountNumber() ==null){
            System.out.println("Null Account Number !!");
        }

        Account senderAccount=accountMatcher(accountList,transferDto.getSenderAccountNumber());
        if(transferDto.getSenderAccountNumber().equals(senderAccount.getAccountNumber())){
            Account receiverAccount=accountMatcher(accountList,transferDto.getReceiverAccountNumber());
            if(transferDto.getReceiverAccountNumber().equals(receiverAccount.getAccountNumber())){
                if(transferDto.getTransferAmount()>=1000 && senderAccount.getBalance()>=1000){
                    senderAccount.setBalance(senderAccount.getBalance()-transferDto.getTransferAmount());
                    transaction(senderAccount,"Send",transferDto.getTransferAmount());
                    updateAccount(senderAccount);
                    receiverAccount.setBalance(receiverAccount.getBalance()+transferDto.getTransferAmount());
                    transaction(receiverAccount,"received",transferDto.getTransferAmount());
                    updateAccount(receiverAccount);
                    System.out.println("Balance Transfer "+transferDto.getTransferAmount()+"\nfrom A/c "
                            +senderAccount.getAccountNumber()+" to A/c "+receiverAccount.getAccountNumber());
                }else{
                    System.out.println(" Insufficient balance !!");
                    System.out.println("fail to transfer !!");
                }

            }else {
                System.out.println(" receiver account number is not match !!");
            }
        }else {
            System.out.println("sender account number is not match !!");
        }

        return  transferDto;
}
}
