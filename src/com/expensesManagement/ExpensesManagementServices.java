package com.expensesManagement;

import java.util.ArrayList;
import java.util.List;

public class ExpensesManagementServices {

    public int totalExpenses(List<OderModel> oderList){
        int sum=0;
        for(OderModel oder:oderList){
            sum += oder.getPrice();

        }

        return sum;
    }



    public List<ExpensesPerHead> perHeadExpenses(int totalMember,int totalExpenses,List<Payment> paymentList){

        List<ExpensesPerHead> expensesPerHeads=new ArrayList<ExpensesPerHead>();
        int perHead=totalExpenses/totalMember;

        for(Payment payment:paymentList){
            if(perHead >=payment.getPaymentAmount()){
                int paymentDeu=perHead-payment.getPaymentAmount();
                expensesPerHeads.add(new ExpensesPerHead(payment.getName(),perHead,paymentDeu,0));
            }else{
                int receivedDeu=payment.getPaymentAmount()-perHead;
                expensesPerHeads.add(new ExpensesPerHead(payment.getName(),perHead,0,receivedDeu));

            }

        }
return  expensesPerHeads;
    }

}
