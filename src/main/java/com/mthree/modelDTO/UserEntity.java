package com.mthree.modelDTO;

public class UserEntity {
    private int eventId;
    private int userId;


    public UserEntity(){}

    public UserEntity(int eventId, int userId) {
        this.eventId = eventId;
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "eventId=" + eventId +
                ", userId=" + userId +
                '}';
    }
}
