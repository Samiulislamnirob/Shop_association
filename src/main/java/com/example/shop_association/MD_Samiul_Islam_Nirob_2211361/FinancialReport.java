package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class FinancialReport {
    private String reportMonth;
    private String account;
    private String transactionDetails;

    public FinancialReport() {
    }

    public FinancialReport(String reportMonth, String account, String transactionDetails) {
        this.reportMonth = reportMonth;
        this.account = account;
        this.transactionDetails = transactionDetails;
    }

    public String getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(String reportMonth) {
        this.reportMonth = reportMonth;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    @Override
    public String toString() {
        return "FinancialReport{" +
                "reportMonth='" + reportMonth + '\'' +
                ", account='" + account + '\'' +
                ", transactionDetails='" + transactionDetails + '\'' +
                '}';
    }
}
