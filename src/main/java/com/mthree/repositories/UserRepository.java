package com.mthree.repositories;

import com.mthree.Entity.Events;
import com.mthree.Entity.Users;
import com.mthree.modelDTO.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

    @Query("select u from Users u where u.events.eventId=:eventId")
    @Transactional
    public List<Users> getUsersByEventId(@Param("eventId") int eventId);


    @Modifying
    @Transactional
    public void deleteUsersByEventsEventIdAndUserId(@Param("eventId") int eventID,
                                              @Param("userId") int userId);

    @Query(value="insert into users(user_name,user_number,event_id) values(:user_name,:user_number,:event_id) ",nativeQuery=true)
    @Modifying
    @Transactional
    public void addUsers(@Param("user_name") String userName,
                         @Param("user_number") int userNumber,
                         @Param("event_id") int eventId);



}
