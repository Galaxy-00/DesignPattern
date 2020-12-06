package com.structural.composite.example;

public class Main {
    public static void main(String[] args) {
        Company root = new ConcreteCompany("上海总公司");
        root.add(new FinanceDepartment("总公司财务部"));
        root.add(new HRDepartment("总公司HR"));

        Company company = new ConcreteCompany("西安分公司");
        company.add(new FinanceDepartment("西安分公司财务部"));
        company.add(new HRDepartment("西安分公司HR"));
        root.add(company);

        Company company1 = new ConcreteCompany("长安区办事处");
        company1.add(new FinanceDepartment("长安区办事处财务部"));
        company.add(company1);

        Company company2 = new ConcreteCompany("友谊区办事区");
        company2.add(new FinanceDepartment("友谊区办事区财务部"));
        company2.add(new HRDepartment("友谊区办事区HR"));
        company.add(company2);

        root.display(1);
        System.out.println();

        root.doWork();
        // company.doWork();
    }

}
