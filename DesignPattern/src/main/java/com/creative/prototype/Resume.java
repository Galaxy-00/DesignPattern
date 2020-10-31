package com.creative.prototype;

public class Resume implements Cloneable {
    WorkExperience workExperience;
    String name;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setCompany(company);
        workExperience.setWorkDate(workDate);
    }

    public void show() {
        System.out.println("name: " + name);
        System.out.println("company: " + workExperience.getCompany());
        System.out.println("workDate: " + workExperience.getWorkDate());
    }

    public Resume clone() {
        Resume resume = new Resume(this.workExperience); // 深复制, 调用该对象的clone
        resume.name = this.name;
        return resume;
    }

    // public Resume clone() { // 浅复制, workExperience对象为引用
    //     Object object = null;
    //     try{
    //         object = super.clone();
    //         return (Resume)object;
    //     }catch(CloneNotSupportedException e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

    public static void main(String[] args) {
        Resume resume = new Resume("A");
        resume.setWorkExperience("2020-10-31", "CA");
        Resume resume2 = resume.clone();
        resume2.setWorkExperience("2020-11-30", "CB");
        
        resume.show();
        resume2.show();
    }
}
