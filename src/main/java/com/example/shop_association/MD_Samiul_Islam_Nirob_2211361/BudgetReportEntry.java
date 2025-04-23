package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

import java.time.LocalDate;

public class BudgetReportEntry {
    private String budgetLimit;
    private LocalDate date;
    private String category;

    public BudgetReportEntry() {
    }

    public BudgetReportEntry(String budgetLimit, LocalDate date, String category) {
        this.budgetLimit = budgetLimit;
        this.date = date;
        this.category = category;
    }

    public String getBudgetLimit() {
        return budgetLimit;
    }

    public void setBudgetLimit(String budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "BudgetReportEntry{" +
                "budgetLimit='" + budgetLimit + '\'' +
                ", date=" + date +
                ", category='" + category + '\'' +
                '}';
    }
}
