package com.bl;

public class EmpWageComputation {
    public static void main(String args[]){
        int wage_per_hour=20,full_day_hour=8,parttime_hour=4;

        //Displaying The Welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //checking the Employee Presence
        int rand = (int) Math.floor(Math.random() * 10) % 3;

        if(rand==0){
            System.out.println("Employee absent");
        }
        else if(rand==1) {
            System.out.println("employee present");
            int wage=wage_per_hour*full_day_hour;
            System.out.println("full time employee wgae"+wage);
        }
        //Adding partime wage
        else{
            System.out.println("employee is parttime");
            int wage=wage_per_hour*parttime_hour;
            System.out.println("parttime wage:"+wage);
        }

    }
}
