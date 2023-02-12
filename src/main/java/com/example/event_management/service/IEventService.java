package com.example.event_management.service;

import com.example.event_management.module.Event;

import java.util.List;

public interface IEventService {
 void addEvent(Event event);
 void updateEvent(String date,Event newevent);
 List<Event> getAllEvent();
 Event getEventByDate(String date);

}
