package com.mthree.Entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_number")
    private int userNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="event_id", referencedColumnName = "event_id")
    private Events events;


    public Users(){}

    public Users(int userId, String userName, int userNumber, Events events) {
        this.userId = userId;
        this.userName = userName;
        this.userNumber = userNumber;
        this.events = events;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Events getEventName() {
        return events;
    }

    public void setEventName(Events eventName) {
        this.events = eventName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userNumber=" + userNumber +
                ", events=" + events.getEventName() +
                '}';
    }
}
