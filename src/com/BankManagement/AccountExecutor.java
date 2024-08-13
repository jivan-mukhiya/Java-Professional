package com.BankManagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountExecutor {

    public static void main(String[] args) throws IOException {
        AccountIo accountIo=new AccountIo();
        AccountFunction  accountFunction=new AccountFunction();


        List<Account> accountList=accountIo.readAccount();


        boolean status=true;
       while (status){
           System.out.println("------------------WELCOME--------------------");
           System.out.println("Enter Your choice !!");
           System.out.println("=================================================");
           Scanner scanner=new Scanner(System.in);
           System.out.println("1. Account List");
           System.out.println("2. Deposit Money");
           System.out.println("3. Withdraw Money");
           System.out.println("4. transfer Money");
           System.out.println("5. View transaction");
           System.out.println("6. Exist");
           System.out.println("===================================================");

           int choice=scanner.nextInt();
           switch (choice){

               case 1:
                   accountIo.displayAccountList(accountList);
                   break;
               case 2:
                 DepositDto depositAmount=  accountFunction.deposit(accountList,accountIo.depositDto());

                   break;
               case 3:
                   WithdrawDto withdrawAmount=  accountFunction.withdraw(accountList,accountIo.withdrawDto());

               case 4:
                  accountFunction.balanceTransfer(accountList,accountIo.balanceTransferDto());
                   break;
               case 5:
                   accountIo.displayTransactionDetails(accountIo.readAccountName());
                   break;
               case 6:
                   System.out.println("Thank you for using Bank Management !");
                   status=false;
                   break;
               default:
                   System.out.println("Invalid choice !");
           }
       }

       }

}
