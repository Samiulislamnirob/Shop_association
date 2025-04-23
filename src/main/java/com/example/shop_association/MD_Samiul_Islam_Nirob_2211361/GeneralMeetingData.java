package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class GeneralMeetingData { private String meetingTitle;
    private String meetingDate;
    private String meetingTime;
    private String meetingAgenda;
    private String participantList;
    private String reminderSchedule;
    private String notificationMessage;

    public GeneralMeetingData(String meetingTitle, String meetingDate, String meetingTime, String meetingAgenda, String participantList, String reminderSchedule, String notificationMessage) {
        this.meetingTitle = meetingTitle;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.meetingAgenda = meetingAgenda;
        this.participantList = participantList;
        this.reminderSchedule = reminderSchedule;
        this.notificationMessage = notificationMessage;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getMeetingAgenda() {
        return meetingAgenda;
    }

    public void setMeetingAgenda(String meetingAgenda) {
        this.meetingAgenda = meetingAgenda;
    }

    public String getParticipantList() {
        return participantList;
    }

    public void setParticipantList(String participantList) {
        this.participantList = participantList;
    }

    public String getReminderSchedule() {
        return reminderSchedule;
    }

    public void setReminderSchedule(String reminderSchedule) {
        this.reminderSchedule = reminderSchedule;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public GeneralMeetingData() {
    }

    @Override
    public String toString() {
        return "GeneralMeetingData{" +
                "meetingTitle='" + meetingTitle + '\'' +
                ", meetingDate='" + meetingDate + '\'' +
                ", meetingTime='" + meetingTime + '\'' +
                ", meetingAgenda='" + meetingAgenda + '\'' +
                ", participantList='" + participantList + '\'' +
                ", reminderSchedule='" + reminderSchedule + '\'' +
                ", notificationMessage='" + notificationMessage + '\'' +
                '}';
    }
}
