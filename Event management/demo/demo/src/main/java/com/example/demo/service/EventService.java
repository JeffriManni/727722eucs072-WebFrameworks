package com.example.demo.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;


@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public Event createEvent(Event event){
        return eventRepository.save(event);
    }

    public void deleteEvent(Long eventId){
        eventRepository.deleteById(eventId);
    }
    public Event updateEvent(Long eventId, Event eventDetails) {
        Event event = eventRepository.findById(eventId)
                .orElse(null);

        event.setName(eventDetails.getName());
      
        // Update other fields as needed

        Event updatedEvent = eventRepository.save(event);
        return updatedEvent;
    }
    
    
}
