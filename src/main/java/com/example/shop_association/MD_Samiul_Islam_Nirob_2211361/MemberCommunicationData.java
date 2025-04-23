package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class MemberCommunicationData {
    private String violationReportID;
    private String reportIssue;
    private String validationStatus;
    private String auditNotes;

    public MemberCommunicationData(String violationReportID, String reportIssue, String validationStatus, String auditNotes) {
        this.violationReportID = violationReportID;
        this.reportIssue = reportIssue;
        this.validationStatus = validationStatus;
        this.auditNotes = auditNotes;
    }

    public String getViolationReportID() {
        return violationReportID;
    }

    public void setViolationReportID(String violationReportID) {
        this.violationReportID = violationReportID;
    }

    public String getReportIssue() {
        return reportIssue;
    }

    public void setReportIssue(String reportIssue) {
        this.reportIssue = reportIssue;
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    public String getAuditNotes() {
        return auditNotes;
    }

    public void setAuditNotes(String auditNotes) {
        this.auditNotes = auditNotes;
    }

    public MemberCommunicationData() {

    }

    @Override
    public String toString() {
        return "MemberCommunicationData{" +
                "violationReportID='" + violationReportID + '\'' +
                ", reportIssue='" + reportIssue + '\'' +
                ", validationStatus='" + validationStatus + '\'' +
                ", auditNotes='" + auditNotes + '\'' +
                '}';
    }
}
