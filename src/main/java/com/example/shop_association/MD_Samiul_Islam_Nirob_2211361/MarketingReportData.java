package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

import java.time.LocalDate;

public class MarketingReportData {
    private String campaignName;
    private LocalDate startDate;
    private LocalDate endDate;

    public MarketingReportData(String campaignName, LocalDate startDate, LocalDate endDate) {
        this.campaignName = campaignName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public MarketingReportData() {
    }

    @Override
    public String toString() {
        return "MarketingReportData{" +
                "campaignName='" + campaignName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
