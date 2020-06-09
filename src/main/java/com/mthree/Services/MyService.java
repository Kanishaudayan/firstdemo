package com.mthree.Services;

import com.mthree.Entity.Events;
import com.mthree.Entity.Users;
import com.mthree.modelDTO.EditEvent;
import com.mthree.modelDTO.UserEntity;
import com.mthree.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mthree.repositories.MyRepository;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private MyRepository myRepository;

    @Autowired
    private UserRepository userRepository;

   public void editEvent(String eventName,String eventPlace,int eventId){
        myRepository.updateEventsByEventId(eventName,eventPlace,eventId);
   }
    public List<Events> getAllEvents(){
       return myRepository.getResult();
    }

    public Events getEvent(int eventId){
       return myRepository.getEventsByEventId(eventId);
    }

    public void deleteEvent(int eventId){
       myRepository.deleteEventsUsersByEventId(eventId);

    }

    public List<Users> getUsers(int eventId){
      return userRepository.getUsersByEventId(eventId);
    }

    public void deleteUserByEventId(int eventId,int userId){
       userRepository.deleteUsersByEventsEventIdAndUserId(eventId,userId);
    }

    public void addUsers(String userName,int userNumber,int eventId){
       userRepository.addUsers(userName,userNumber,eventId);
    }

}
