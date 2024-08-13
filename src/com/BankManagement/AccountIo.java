package com.BankManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountIo {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void message(String msg){
        System.out.println(msg);
    }

    public List<Account> readAccount() throws FileNotFoundException {

        List<Account> accounts = new ArrayList<Account>();

        String filePath = "C://Users/THINKPAD/OneDrive/Documents/BankData/bankDetails.txt";

        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] account = line.split(",");

            accounts.add(new Account(account[0], Double.parseDouble(account[1]), account[2]));

        }
        return accounts;
    }

    public String readAccountName() throws IOException {
        message("Enter account name: ");

        return br.readLine();
    }

    public String readAccountNumber() throws IOException {
        message("Enter account Number: ");

        return br.readLine();
    }

    public double readAmount() throws IOException {
        message("Enter account : ");

        return Double.parseDouble(br.readLine());
    }


public void displayAccountList(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
}

public BalanceTransferDto balanceTransferDto() throws IOException {
    System.out.println("Enter sender Account Details :");
    String senderAccountNumber=readAccountNumber();
    double transferAmount=readAmount();

    System.out.println("Enter receiver Account Details :");
    String receiverAccountNumber=readAccountNumber();

        return new BalanceTransferDto(receiverAccountNumber,senderAccountNumber,transferAmount);
}

public DepositDto  depositDto() throws IOException {

        return new DepositDto(readAccountNumber(),readAmount(),readAccountName());
}

    public WithdrawDto  withdrawDto() throws IOException {

        return new WithdrawDto(readAccountNumber(),readAmount(),readAccountName());
    }


    public void displayTransactionDetails(String accountNumber) throws FileNotFoundException {
        String filePath="C://Users/THINKPAD/OneDrive/Documents/BankData/transection.txt";
        FileReader fileReader=new FileReader(filePath);
        Scanner scanner=new Scanner(fileReader);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] transactionDetails = line.split(",");

            if(accountNumber.equals(transactionDetails[0])){
                System.out.println("-----------------------------------------------------");
                System.out.println(transactionDetails[3]+" "+transactionDetails[4]+"\nA/c " +
                        transactionDetails[0]);
                System.out.println("-----------------------------------------------------");
                System.out.println();
            }

        }

    }

}
