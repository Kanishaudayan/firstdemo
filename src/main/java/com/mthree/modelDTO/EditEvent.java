package com.mthree.modelDTO;

public class EditEvent {

    private int eventId;
    private String eventName;
    private String eventPlace;

    public EditEvent(){}
    public EditEvent(int eventId, String eventName, String eventPlace) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventPlace = eventPlace;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    @Override
    public String toString() {
        return "EditEvent{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventPlace='" + eventPlace + '\'' +
                '}';
    }
}
