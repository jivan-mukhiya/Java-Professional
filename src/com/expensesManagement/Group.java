package com.expensesManagement;

public class Group {
    private String groupName;
    private String groupMember;

    public Group(String groupName, String groupMember) {
        this.groupName = groupName;
        this.groupMember = groupMember;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(String groupMember) {
        this.groupMember = groupMember;
    }

    public Group() {
    }

    @Override
    public String toString() {
        return "GroupModel{" +
                "groupName='" + groupName + '\'' +
                ", groupMember='" + groupMember + '\'' +
                '}';
    }
}
