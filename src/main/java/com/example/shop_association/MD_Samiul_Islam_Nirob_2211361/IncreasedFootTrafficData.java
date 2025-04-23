package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class IncreasedFootTrafficData {
    private String userName;
    private String selectedCategories;
    private String promotionEligibility;

    public IncreasedFootTrafficData(String userName, String selectedCategories, String promotionEligibility) {
        this.userName = userName;
        this.selectedCategories = selectedCategories;
        this.promotionEligibility = promotionEligibility;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSelectedCategories() {
        return selectedCategories;
    }

    public void setSelectedCategories(String selectedCategories) {
        this.selectedCategories = selectedCategories;
    }

    public String getPromotionEligibility() {
        return promotionEligibility;
    }

    public void setPromotionEligibility(String promotionEligibility) {
        this.promotionEligibility = promotionEligibility;
    }

    @Override
    public String toString() {
        return "IncreasedFootTrafficData{" +
                "userName='" + userName + '\'' +
                ", selectedCategories='" + selectedCategories + '\'' +
                ", promotionEligibility='" + promotionEligibility + '\'' +
                '}';
    }

    public IncreasedFootTrafficData() {

    }
}
