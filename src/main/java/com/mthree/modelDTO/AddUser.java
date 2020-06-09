package com.mthree.modelDTO;

public class AddUser {
    private String userName;
    private int userNumber;
    private int eventId;

    public AddUser(String userName, int userNumber, int eventId) {
        this.userName = userName;
        this.userNumber = userNumber;
        this.eventId = eventId;
    }

    public AddUser() {
    }

    @Override
    public String toString() {
        return "AddUser{" +
                "userName='" + userName + '\'' +
                ", userNumber=" + userNumber +
                ", eventId=" + eventId +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
