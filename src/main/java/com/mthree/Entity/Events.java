package com.mthree.Entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="events")
public class Events {

    @Id
    @GeneratedValue
    @Column(name="event_id")
    private int eventId;

    @Column(name="event_name")
    private String  eventName;

    @Column(name="event_place")
    private String eventPlace;
    public Events(){}
    public Events(int eventId, String eventName, String eventPlace) {
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
        return "Events{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventPlace='" + eventPlace + '\'' +
                '}';
    }
}
