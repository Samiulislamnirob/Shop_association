package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class MeetingWithPresidentData {
    private String reports;
    private String futurePlans;
    private String summary;

    public MeetingWithPresidentData() {
    }

    public MeetingWithPresidentData(String reports, String futurePlans, String summary) {
        this.reports = reports;
        this.futurePlans = futurePlans;
        this.summary = summary;
    }

    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }

    public String getFuturePlans() {
        return futurePlans;
    }

    public void setFuturePlans(String futurePlans) {
        this.futurePlans = futurePlans;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "MeetingWithPresidentData{" +
                "reports='" + reports + '\'' +
                ", futurePlans='" + futurePlans + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
