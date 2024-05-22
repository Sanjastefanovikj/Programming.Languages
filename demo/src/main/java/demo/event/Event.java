package com.example.demo.event;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table
public class Event {
    @Id
    @SequenceGenerator(
            name = "event_sequence",
            sequenceName = "event_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "event_sequence"
    )


    private Long id;
    private String name;
    private String venue;
    private Double time;
    private LocalDate date;


    public Event(long l, String dnk, String borisTrajkovski, String s) {
    }

    public Event(Long id,
                 String name,
                 String venue,
                 Double time,
                 LocalDate date) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.time = time;
        this.date = date;
    }

    public Event(String name,
                 String venue,
                 Double time,
                 LocalDate date) {
        this.name = name;
        this.venue = venue;
        this.time = time;
        this.date = date;
    }

    public Event() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", venue='" + venue + '\'' +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
