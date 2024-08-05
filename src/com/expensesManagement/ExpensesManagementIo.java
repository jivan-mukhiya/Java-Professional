package com.expensesManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpensesManagementIo {

private Scanner scanner=new Scanner(System.in);

public List<Group> readGroup(int size){
    List<Group> groups=new ArrayList<Group>();
    System.out.println("Enter group name: ");
    String groupName=scanner.nextLine();
    for(int i=0;i<size;i++){
        System.out.println("Enter group Member Name:"+ (i+1) +":");
        String memberName=scanner.nextLine();

        groups.add(new Group(groupName,memberName));


    }
   return  groups;
}

public List<Oder> readOrder(int item){
    List<Oder>  oderList = new ArrayList<>();

    System.out.println("Enter Your Oder: ");
    for(int i=0;i<item;i++) {

        System.out.println("FoodName: ");
        String foodName = scanner.next();
        System.out.println("Price: ");
        int price = scanner.nextInt();

        oderList.add(new Oder(foodName, price));
    }
    return oderList;
}

    public void displayGroupList(List<Group>  groupMemberList){
  for(Group groupModel:groupMemberList){
      System.out.println("Group Name "+groupModel.getGroupName()+"Name : "+groupModel.getGroupMember()+"\n");
  }

    }

    public List<Payment> readPayment(List<Group> groupMemberList,int perHead){

    List<Payment> paymentList = new ArrayList<>();
    for(Group group:groupMemberList){
        System.out.println("Name: "+group.getGroupMember()+"  PerHead: "+perHead);
        System.out.println("Amount :");
        int amount=scanner.nextInt();

        paymentList.add(new Payment(group.getGroupMember(),amount));
    }
    return  paymentList;
    }

    public void displaypayment(List<Payment> paymentList){
    for(Payment payment:paymentList){
        System.out.println("Name :"+payment.getName()+", Amount :"+payment.getPaymentAmount()+"\n");
    }
    }

    public void displayOderList(List<Oder> oderList, int totalExpenses){
    for(Oder oder:oderList){
        System.out.println("Oder Name :"+oder.getFoodName()+",  Price :"+oder.getPrice()+"\n");
    }
    System.out.println("Total Oder Amount :"+totalExpenses);
    }

    public void finalTransaction(List<ExpensesPerHead> expensesPerHeads,int totalExpenses){

    for(ExpensesPerHead expensesPerHead:expensesPerHeads){
        System.out.println("Name :"+expensesPerHead.getName());
        System.out.println("perHead Amount :"+expensesPerHead.getAmount());
        System.out.println("PaymentDeu Amount :"+expensesPerHead.getPaymentDeu());
        System.out.println("ReceivedDeu Amount :"+expensesPerHead.getReceivedDeu());

        System.out.println("----------------------------------------\n");
    }
    System.out.println("Total Expense Amount :"+totalExpenses);
    }
}


