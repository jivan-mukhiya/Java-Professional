package com.expensesManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpensesManagementIo {

private Scanner scanner=new Scanner(System.in);

public List<GroupModel> readGroup(int size){
    List<GroupModel> groups=new ArrayList<GroupModel>();
    System.out.println("Enter group name: ");
    String groupName=scanner.nextLine();
    for(int i=0;i<size;i++){
        System.out.println("Enter group Member Name:"+ (i+1) +":");
        String memberName=scanner.nextLine();

        groups.add(new GroupModel(groupName,memberName));


    }
   return  groups;
}

public List<OderModel> readOrder(int item){
    List<OderModel>  oderList = new ArrayList<>();

    System.out.println("Enter Your Oder: ");
    for(int i=0;i<item;i++) {

        System.out.println("FoodName: ");
        String foodName = scanner.nextLine();
        System.out.println("Price: ");
        int price = scanner.nextInt();

        oderList.add(new OderModel(foodName, price));
    }
    return oderList;
}

    public void displayGroupList(List<GroupModel>  groupMemberList){
  for(GroupModel groupModel:groupMemberList){
      System.out.println(groupModel.toString());
  }

    }

    public List<Payment> readPayment(List<GroupModel> groupMemberList){

    List<Payment> paymentList = new ArrayList<>();
    for(GroupModel groupModel:groupMemberList){
        System.out.println("Name: "+groupModel.getGroupMember());
        System.out.println("Amount :"+scanner.nextInt());

        paymentList.add(new Payment(groupModel.getGroupMember(),scanner.nextInt()));
    }
    return  paymentList;
    }
}


