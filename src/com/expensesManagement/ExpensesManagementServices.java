package com.expensesManagement;

import java.util.ArrayList;
import java.util.List;

public class ExpensesManagementServices {

    public int totalExpenses(List<Oder> oderList){
        int sum=0;
        for(Oder oder:oderList){
            sum += oder.getPrice();

        }

        return sum;
    }



    public List<ExpensesPerHead> perHeadExpenses(int perHeadExpenses,List<Payment> paymentList){

        List<ExpensesPerHead> expensesPerHeads=new ArrayList<ExpensesPerHead>();


        for(Payment payment:paymentList){
            if(perHeadExpenses >=payment.getPaymentAmount()){
                int paymentDeu=perHeadExpenses-payment.getPaymentAmount();
                expensesPerHeads.add(new ExpensesPerHead(payment.getName(),perHeadExpenses,paymentDeu,0));
            }else{
                int receivedDeu=payment.getPaymentAmount()-perHeadExpenses;
                expensesPerHeads.add(new ExpensesPerHead(payment.getName(),perHeadExpenses,0,receivedDeu));

            }

        }
return  expensesPerHeads;
    }

    public int perHeadExpenses(int totalExpenses,int totalMember){
        int perHead=totalExpenses/totalMember;

        return perHead;
    }

}
