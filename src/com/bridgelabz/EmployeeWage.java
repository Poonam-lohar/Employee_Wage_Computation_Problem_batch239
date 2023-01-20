package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage ("Amazon",20,2,10);
        empWageBuilder.addCompanyEmpWage("reliance",10,4,20);
        empWageBuilder.addCompanyEmpWage("DMart",10,4,20);
        empWageBuilder.addCompanyEmpWage("FlipCart",15,5,30);
        empWageBuilder.computeEmpWage();
    }
}