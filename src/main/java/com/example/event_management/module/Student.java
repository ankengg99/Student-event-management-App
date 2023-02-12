package com.example.event_management.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int studentId;
    @Column
  private String  first_name;
    @Column
   private String last_name;
    @Column
    private int age;
    @Column
    private String department;
}

