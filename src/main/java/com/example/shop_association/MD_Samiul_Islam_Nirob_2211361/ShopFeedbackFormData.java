package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class ShopFeedbackFormData {
    private String shopName;
    private String ownerName;
    private String feedback;

    public ShopFeedbackFormData() {

    }

    public ShopFeedbackFormData(String shopName, String ownerName, String feedback) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.feedback = feedback;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "ShopFeedbackFormData{" +
                "shopName='" + shopName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
