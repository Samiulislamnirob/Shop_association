package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class ShopApplication {
    private String applicantName;
    private String shopDetails;
    private String shopumnents;
    private String shopRegistration;

    public ShopApplication() {
    }

    public ShopApplication(String applicantName, String shopDetails, String shopumnents, String shopRegistration) {
        this.applicantName = applicantName;
        this.shopDetails = shopDetails;
        this.shopumnents = shopumnents;
        this.shopRegistration = shopRegistration;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getShopDetails() {
        return shopDetails;
    }

    public void setShopDetails(String shopDetails) {
        this.shopDetails = shopDetails;
    }

    public String getShopumnents() {
        return shopumnents;
    }

    public void setShopumnents(String shopumnents) {
        this.shopumnents = shopumnents;
    }

    public String getShopRegistration() {
        return shopRegistration;
    }

    public void setShopRegistration(String shopRegistration) {
        this.shopRegistration = shopRegistration;
    }
}
