package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Event;
import com.example.demo.service.EventService;



@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/getall")
    public java.util.List<Event> getAllEvents(){
        return (java.util.List<Event>) eventService.getAllEvents();
    }

    @PostMapping("/insert")
    public Event createEvent(@RequestBody Event event){
        Event createdEvent = eventService.createEvent(event);
        return createdEvent;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable("id") Long eventId){
        eventService.deleteEvent(eventId);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/update/{id}")
public ResponseEntity<Event> updateEvent(@PathVariable("id") Long eventId, @RequestBody Event eventDetails){
    Event updatedEvent = eventService.updateEvent(eventId, eventDetails);
    return ResponseEntity.ok(updatedEvent);
}




}


