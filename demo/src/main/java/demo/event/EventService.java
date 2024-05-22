package com.example.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EventService {


    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }



    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    void addNewEvent(Event event) {
      Optional<Event> EventOptional= eventRepository.findEventByVenue(event.getVenue());
       if (EventOptional.isPresent()) {
           throw new IllegalStateException("Event already exists");
       }

        eventRepository.save(event);
    }

       public void deleteEvent(Long eventId){
        eventRepository.findById(eventId);
        boolean exists = eventRepository.existsById(eventId);
        if (!exists) {
            throw new IllegalStateException("Event does not exist");
        }
        eventRepository.deleteById(eventId);
       }

       @Transactional
    public void updateEvent(Long eventId, String name, String venue) {
        Event event = eventRepository.findById(eventId)
                .orElseThrow(()-> new IllegalStateException("Event does not exist"));

         if(name != null && !(name.length() > 0) &&
            !Objects.equals(event.getName(), name)) {
             event.setName(name);
         }
           if(venue != null && !(venue.length() > 0) &&
                   !Objects.equals(event.getVenue(), venue)) {
               Optional<Event> eventOptional = eventRepository.findEventByVenue(event.getVenue());
               if (eventOptional.isPresent()) {
                   throw new IllegalStateException("Event already exists");
               }
               event.setVenue(venue);
           }
       }
}
