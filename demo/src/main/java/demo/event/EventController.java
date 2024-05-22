package com.example.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/event")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {

        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getEvents() {

        return eventService.getEvents();
    }

    @PostMapping
    public void registerEvent(@RequestBody Event event) {
        eventService.addNewEvent(event);
        
    }

    @DeleteMapping(path="{eventID}")
    public void deleteEvent(@PathVariable("eventID")Long eventId){
        eventService.deleteEvent(eventId);
    }

    @PutMapping (path = "{eventId}")
    public void updateEvent(
             @PathVariable("eventId")Long eventId,
             @RequestParam (required = false) String name,
             @RequestParam (required = false) String venue){
        eventService.updateEvent (eventId, name, venue);
    }
}
