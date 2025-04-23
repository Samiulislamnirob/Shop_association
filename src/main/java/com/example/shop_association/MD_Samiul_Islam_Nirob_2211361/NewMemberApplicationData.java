package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class NewMemberApplicationData {
    private String name;
    private String email;
    private String phone;
    private String documents;

    public NewMemberApplicationData(String name, String email, String phone, String documents) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.documents = documents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public NewMemberApplicationData() {

    }

    @Override
    public String toString() {
        return "NewMemberApplicationData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", documents='" + documents + '\'' +
                '}';
    }
}
