package com.expensesManagement;

import java.util.List;

public class  ExpensesManagementExecutor {

    public static void main(String[] args) {
        ExpensesManagementIo expensesManagementIo = new ExpensesManagementIo();

        List<GroupModel> groupModelsList=expensesManagementIo.readGroup(5);

        expensesManagementIo.displayGroupList(groupModelsList);
    }
}
