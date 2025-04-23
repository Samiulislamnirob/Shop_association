package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

import java.time.LocalDate;

public class EventRegistration {
    private String name;
    private LocalDate date;
    private String description;
    private String type;

    public EventRegistration() {
    }

    public EventRegistration(String name, LocalDate date, String description, String type) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EventRegistration{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
