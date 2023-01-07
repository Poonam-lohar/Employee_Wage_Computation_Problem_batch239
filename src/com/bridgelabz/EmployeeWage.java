package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("...Welcome To Employee Wage Computation Program...");

        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int PART_TIME__HOUR = 4;
        final int IS_FULL_TIME = 2;
        final int IS_PART_TIME = 1;
        final int WORKING_DAY_PER_MONTH = 20;


        int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
        int dayCount = 1;
        while (dayCount <= WORKING_DAY_PER_MONTH) {
            int empWage = 0;
            switch (empPresent) {
                case IS_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee FULL-TIME");
                    break;
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME__HOUR;
                    System.out.println("Employee PART-TIME");
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Employee daily wage: " + dayCount + " =>" + empWage);
            dayCount++;
        }
    }
}