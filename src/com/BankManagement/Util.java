package com.BankManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {

    //For Account check and validation
    public Account accountMatcher(List<Account> accountList, String accountNumber){

        for(Account acc : accountList){
            if(acc.getAccountNumber().equals(accountNumber)){
                return  acc;
            }
        }
        return null;
    }

// Transaction  write in txt file
    public void transaction(Account  account,String typesOfTransaction,double amount)  {
        String message=account.getAccountNumber()+","+account.getBalance()+","
                +account.getAccountHolderName()+","
                +typesOfTransaction+","+amount;
        try{
            FileWriter fileWriter = new FileWriter("C://Users/THINKPAD/OneDrive/Documents/BankData/transection.txt",true);
            fileWriter.write("\n"+message);

            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateAccount(Account account){
        String filePath="C://Users/THINKPAD/OneDrive/Documents/BankData/bankDetails.txt";
        String message=account.getAccountNumber()+","+account.getBalance()+","+account.getAccountHolderName();

        try{
            List<String> lines=new ArrayList<>();
            BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
            String line;
            while ((line=bufferedReader.readLine()) !=null){
                if(line.contains(account.getAccountNumber())){
                    lines.add(message);
                }else{
                    lines.add(line);
                }
            }
            bufferedReader.close();

            //Write the modified line
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filePath));
            for(String modifiedLine:lines){
                bufferedWriter.write(modifiedLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Account updated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
