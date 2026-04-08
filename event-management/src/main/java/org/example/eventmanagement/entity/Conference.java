package org.example.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;
    public Conference() {}

    public Conference(String title, java.time.LocalDate date, Integer duration,
                      String location, List<Guest> guests, List<Speaker> speakers) {
        super(title, date, duration, location, guests);
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers; }
    public void setSpeakers(List<Speaker> speakers) { this.speakers = speakers; }
}
