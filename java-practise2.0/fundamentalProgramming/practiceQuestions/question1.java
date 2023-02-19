package practiceQuestions;
/*
Ramesh’s basic salary is input through the keyboard. His
dearness allowance is 40% of basic salary, and house rent
allowance is 20% of basic salary. Write a program to calculate
his gross salary.
 */

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int basicSalary, dearnessAllowance, rentAllowance, grossSalary;

        System.out.print("Write your Basic Salary: ");
        basicSalary = scn.nextInt();

        dearnessAllowance = (basicSalary * 40) / 100;
        rentAllowance = (basicSalary * 20) / 100;
        grossSalary = (basicSalary + dearnessAllowance + rentAllowance);

        System.out.println("So, your Gross Salary is: " + grossSalary);

    }
}
