package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class CustomerFeedback {
    private String name;
    private String gmail;
    private String category;
    private String feedback;

    public CustomerFeedback() {
    }

    public CustomerFeedback(String name, String gmail, String category, String feedback) {
        this.name = name;
        this.gmail = gmail;
        this.category = category;
        this.feedback = feedback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "CustomerFeedback{" +
                "name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", category='" + category + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}