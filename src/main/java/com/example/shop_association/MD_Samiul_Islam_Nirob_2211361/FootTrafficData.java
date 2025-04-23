package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class FootTrafficData {
    private String campaignName;
    private String campaignType;
    private String targetAudience;
    private String promotionStartDate;
    private String promotionEndDate;
    private String promotionalContent;
    private String status;

    public FootTrafficData() {
    }

    public FootTrafficData(String campaignName, String campaignType, String targetAudience, String promotionStartDate, String promotionEndDate, String promotionalContent, String status) {
        this.campaignName = campaignName;
        this.campaignType = campaignType;
        this.targetAudience = targetAudience;
        this.promotionStartDate = promotionStartDate;
        this.promotionEndDate = promotionEndDate;
        this.promotionalContent = promotionalContent;
        this.status = status;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getPromotionStartDate() {
        return promotionStartDate;
    }

    public void setPromotionStartDate(String promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }

    public String getPromotionEndDate() {
        return promotionEndDate;
    }

    public void setPromotionEndDate(String promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }

    public String getPromotionalContent() {
        return promotionalContent;
    }

    public void setPromotionalContent(String promotionalContent) {
        this.promotionalContent = promotionalContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FootTrafficData{" +
                "campaignName='" + campaignName + '\'' +
                ", campaignType='" + campaignType + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", promotionStartDate='" + promotionStartDate + '\'' +
                ", promotionEndDate='" + promotionEndDate + '\'' +
                ", promotionalContent='" + promotionalContent + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
