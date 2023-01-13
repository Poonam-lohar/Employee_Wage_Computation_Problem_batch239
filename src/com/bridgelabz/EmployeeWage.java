package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        EmpWageBuilder amazon = new EmpWageBuilder("Amazon",20,2,10);
        EmpWageBuilder reliance = new EmpWageBuilder("reliance",10,4,20);
        amazon.computeEmpWage();
        System.out.println(amazon);
        reliance.computeEmpWage();
        System.out.println(reliance);

    }
}