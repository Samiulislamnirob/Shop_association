package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class EmergencyPlan {
    private String scenario;

    public EmergencyPlan() {
    }

    public EmergencyPlan(String scenario) {
        this.scenario = scenario;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    @Override
    public String toString() {
        return "EmergencyPlan{" +
                "scenario='" + scenario + '\'' +
                '}';
    }
}
