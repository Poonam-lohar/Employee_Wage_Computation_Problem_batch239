package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("...Welcome To Employee Wage Computation Program...");

         final int WAGE_PER_HOUR = 20;
         final int FULL_DAY_HOUR = 8;


            int empPresent = (int) (Math.floor(Math.random() * 10) % 2);
            int empWage = 0;
            if (empPresent == 1) {
                empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employee is Present");
            } else {
                System.out.println("Employee is Absent");
            }
            System.out.println("Employee daily wage: " + empWage);
        }
    }