package com.example.event_management.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int eventId;

  private  String  eventName;

   private String locationOfEvent;

  private String  eventDate;

   private String startTime;

    private String endTime;

}
