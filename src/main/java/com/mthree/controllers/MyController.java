package com.mthree.controllers;

import com.mthree.Entity.Events;
import com.mthree.Entity.Users;
import com.mthree.Services.MyService;
import com.mthree.modelDTO.AddUser;
import com.mthree.modelDTO.EditEvent;
import com.mthree.modelDTO.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private MyService myService;

    //List all the events in the System
    @GetMapping(value="/events")
    public ResponseEntity getEvents(){
        List<Events> events=myService.getAllEvents();
         return ResponseEntity.ok().body(events);
    }

    //List an individual event
    @GetMapping("/{eventId}")
    public Events getEventById(@PathVariable("eventId") int eventId) {
        Events c = myService.getEvent(eventId);
        return c;
    }

    //edit an event
    @PostMapping(value="/editevent")
    public ResponseEntity editEvent(@RequestBody EditEvent editEvent){
        myService.editEvent(editEvent.getEventName(),editEvent.getEventPlace(),editEvent.getEventId());
        return ResponseEntity.ok("Successfully Edited");
    }


    //delete an event
    @PostMapping("/deleteevent/{eventId}")
    public ResponseEntity deleteEvent(@PathVariable("eventId") int eventId){
        myService.deleteEvent(eventId);
        return ResponseEntity.ok("Successfully deleted");
    }

    //list the users attending an event
    @GetMapping(value="/user/eventid/{eventId}")
    public ResponseEntity getUsers(@PathVariable("eventId") int eventId){
        List<Users> users=myService.getUsers(eventId);
        return ResponseEntity.ok().body(users);
    }

    //add a user to an event
    @PostMapping(value="/addUser")
    public ResponseEntity addUserByEventId(@RequestBody AddUser addUser){
        myService.addUsers(addUser.getUserName(),addUser.getUserNumber(),addUser.getEventId());
        return ResponseEntity.ok("Succeessfully Added");
    }

    //delete a user from an event
    @PostMapping(value="/deleteuser")
    public ResponseEntity deleteUser(@RequestBody UserEntity userEntity){
        myService.deleteUserByEventId(userEntity.getEventId(),userEntity.getUserId());
        return ResponseEntity.ok("Successfully Deleted");
    }


}
