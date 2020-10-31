package com.structural.prototype;

public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public WorkExperience clone() {
        Object object = null;
        try {
            object = super.clone();
            return (WorkExperience) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
