package com.expensesManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  ExpensesManagementExecutor {

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        ExpensesManagementIo expensesManagementIo = new ExpensesManagementIo();
        ExpensesManagementServices expensesManagementServices = new ExpensesManagementServices();
        System.out.println("Group Member Size :");
        int groupMemberSize = scanner.nextInt();
        List<Group> groupList=expensesManagementIo.readGroup(groupMemberSize);
        List<Oder> oderList = new ArrayList<>();
        List<Payment> paymentList = new ArrayList<>();
        List<ExpensesPerHead> expensesPerHeads=new ArrayList<>();
        int total=0;
        int perHead=0;

        boolean status=true;

        while(status){
            System.out.println("Enter Your Choice !");
            System.out.println("1. View Group Member ");
            System.out.println("2. Oder Food  ");
            System.out.println("3. View Oder ");
            System.out.println("4. Payment");
            System.out.println("5. Payment List");
            System.out.println("6. Final Transaction");
            System.out.println("7. Exist");
            int choice=scanner.nextInt();

            switch(choice){
                case 1:
                    expensesManagementIo.displayGroupList(groupList);
                    break;
                case 2:
                    System.out.println("Enter Your Oder Size");
                    int oderSize = scanner.nextInt();
                    oderList=expensesManagementIo.readOrder(oderSize);
                    break;
                case 3:
                     total=expensesManagementServices.totalExpenses(oderList);
                    expensesManagementIo.displayOderList(oderList,total);
                    break;
                case 4:
                     perHead=expensesManagementServices.perHeadExpenses(total,groupList.size());
                    paymentList= expensesManagementIo.readPayment(groupList,perHead);
                    break;
                case 5:
                    expensesManagementIo.displaypayment(paymentList);
                    break;
                case 6:

                   expensesPerHeads= expensesManagementServices.perHeadExpenses(perHead,paymentList);

                   expensesManagementIo.finalTransaction(expensesPerHeads,total);
                    break;
                case 7:
                    System.out.println("Thank You !");
                    status=false;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

        }
    }
}
