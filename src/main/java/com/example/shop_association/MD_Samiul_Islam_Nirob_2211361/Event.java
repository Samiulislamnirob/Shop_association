package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class Event {
    private String title;
    private LocalDate date;

    public Event() {
    }

    public Event(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
