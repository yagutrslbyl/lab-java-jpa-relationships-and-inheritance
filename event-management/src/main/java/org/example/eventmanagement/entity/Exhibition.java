package org.example.eventmanagement.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Exhibition extends Event {
    public Exhibition() {}

    public Exhibition(String title, LocalDate date, Integer duration,
                      String location, List<Guest> guests) {
        super(title, date, duration, location, guests);
    }
}
