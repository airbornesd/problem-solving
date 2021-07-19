/*
Frank's Carpet Cleaning Service
    Charges:
        $25 per small room
        $35 per large room
    Sales tax rate is 6%
    Estimates are valid for 30 days

    Prompt the user for the number of small and large rooms they would like cleaned
    and provide an estimate
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Create a tool(k/a-object) for reading user input and name it scn.
        Scanner scn = new Scanner(System.in);

        // Variables declaration
        int smallRoom, largeRoom;
        double priceSmallRoom, priceLargeRoom, totalCost, saleTax;

        // Rates according to question
        priceSmallRoom = 25.0;
        priceLargeRoom = 35.0;
        saleTax = 6;

        // Printing message and user Inputs
        System.out.println("Welcome to the Carpet Cleaning Service");
        System.out.print("How many number of small room would you like to get cleaned up? ");
        smallRoom = scn.nextInt();
        System.out.print("How many number of large room would you like to get cleaned up? ");
        largeRoom = scn.nextInt();

        // Room Prices for user
        priceSmallRoom = smallRoom * priceSmallRoom;
        System.out.println("Price for small room would be: $" + priceSmallRoom);
        priceLargeRoom = largeRoom * priceLargeRoom;
        System.out.println("Price for large room would be: $" + priceLargeRoom);
        totalCost = priceSmallRoom + priceLargeRoom;
        System.out.println("Cost: $" + totalCost);

        // Calculating sale tax for the bill
        saleTax = (totalCost * saleTax) / 100;
        System.out.println("Tax: $" + String.format("%.2f", saleTax));

        System.out.println("=====================================================");

        // Estimate cost valid for 30 days
        totalCost = totalCost + saleTax;
        System.out.println("So, total estimate would be: $" + String.format("%.2f", totalCost));
    }
}
