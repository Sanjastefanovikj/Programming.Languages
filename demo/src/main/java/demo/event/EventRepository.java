package com.example.demo.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface EventRepository
        extends JpaRepository <Event, Long> {

    @Query("Select e from Event e WHERE e.venue = ?1")
     Optional<Event> findEventByVenue(String venue) ;
    }
