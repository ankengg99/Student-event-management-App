package com.example.event_management.controller;

import com.example.event_management.module.Event;
import com.example.event_management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("event-app/v1")
public class EventController {
   @Autowired
    EventService eventService;

   @GetMapping("/get-all/event")
    public List<Event> get_all(){
       return eventService.getAllEvent();
   }

   @GetMapping("/get-event/date/{date}")
    public Event getbyDate(@PathVariable String date){
       return eventService.getEventByDate(date);
   }
   @PostMapping("/add-event")
    public void add_event(@RequestBody Event event){
       eventService.addEvent(event);
   }
   @PutMapping("/update event/date/{date}")
    public void update_event(@PathVariable String date, @RequestBody Event event){
       eventService.updateEvent(date,event);
   }

}
