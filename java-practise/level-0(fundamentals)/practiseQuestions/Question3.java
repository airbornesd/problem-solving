package practiseQuestions;/*
  Ramesh's basic salary is input through the keyboard. His
  dearness allowance is 40% of basic salary, and house rent allowance
  is 20% of basic salary.
  Write a program to calculate his gross salary.
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Variables declaration
        double basicSalary, dearnessAllowance, houseRentAllowance, grossSalary;

        System.out.print("Enter your Basic Salary: ");

        // Now here we will assign a data type-Double were the user will input it's Basic Salary and it will get stored.
        basicSalary = scn.nextDouble();

        // According to the question~
        dearnessAllowance = (basicSalary * 40) / 100;
        houseRentAllowance = (basicSalary * 20) / 100;

        // Formula for calculating Gross Salary(not so accurate but relevant for the problem given)
        grossSalary = (basicSalary + dearnessAllowance + houseRentAllowance);


        // Output #grossSalary
        System.out.println("So, your Gross Salary must be: " + grossSalary);
        System.out.println("Thank You!");


    }
}
