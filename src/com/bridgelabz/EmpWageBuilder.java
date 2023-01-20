package com.bridgelabz;

public class EmpWageBuilder {

    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    String company;
    int wagePerHour;
    int workingDayPerMonth;
    int workingHourPerMonth;
    int totalWage;

    public EmpWageBuilder(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDayPerMonth = workingDayPerMonth;
        this.workingHourPerMonth = workingHourPerMonth;
    }


    void computeEmpWage() {
        int empPresent = (int) (Math.floor((Math.random() * 10) % 3));
        int dayCount = 1;
        int workingHrs = 0;

        while (dayCount <= workingDayPerMonth && workingHrs <= workingHourPerMonth) {

            int empWage = 0;
            switch (empPresent) {

                case IS_FULL_TIME:
                    empWage = wagePerHour * FULL_DAY_HOUR;
                    workingHrs += FULL_DAY_HOUR;
                    System.out.println("Employee Full-Time");
                    break;
                case IS_PART_TIME:
                    empWage = wagePerHour * PART_TIME_HOUR;
                    workingHrs += PART_TIME_HOUR;
                    System.out.println("Employee PART-TIME");
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Employee daily wage Day : " + dayCount + " +> " + empWage);
            dayCount++;
            System.out.println("Working Hours: " + workingHrs);
        }
    }

    @Override
    public String toString() {
        return "EmpWageBuilder{" +
                "company='" + company + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDayPerMonth=" + workingDayPerMonth +
                ", workingHourPerMonth=" + workingHourPerMonth +
                ", totalWage=" + totalWage +
                '}';
    }
}
