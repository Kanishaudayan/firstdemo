package com.mthree.repositories;

import com.mthree.Entity.Events;
import com.mthree.modelDTO.EditEvent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface MyRepository extends JpaRepository<Events,String> {

    @Query(value="select * from events",nativeQuery=true)
    @Transactional
    List<Events> getResult();

    @Query("UPDATE Events e SET e.eventName=:eventName,e.eventPlace=:eventPlace  WHERE e.eventId=:eventId")
    @Modifying
    @Transactional
    public void updateEventsByEventId(@Param("eventName") String eventName,
                                     @Param("eventPlace") String eventPlace,
                                     @Param("eventId") int eventId);

    @Transactional
   public Events getEventsByEventId(int eventId);

    @Query(value="delete from users,events  " +
            "using users inner join events " +
            "where users.event_id=events.event_id " +
            "and events.event_Id=:eventId",nativeQuery=true)

   @Modifying
   @Transactional
   public void deleteEventsUsersByEventId(@Param("eventId") int eventId);


}
