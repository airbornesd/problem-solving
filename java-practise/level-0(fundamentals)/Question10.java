/*
If cost price and selling price of an item are input through the keyboard, write a program to
 determine whether the seller has made profit or incurred loss. Also determine how much
 profit he made or loss he incurred.
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int costPrice, sellingPrice, profit, loss;

        System.out.print("Please enter cost price: ");
        costPrice = scn.nextInt();
        System.out.print("Please enter selling price: ");
        sellingPrice = scn.nextInt();

        // Test condition using if-else statement
        if (sellingPrice > costPrice) {
            profit = sellingPrice - costPrice;
            System.out.println("By " + profit + "$ you made a Profit!");
        } else {
            loss = costPrice - sellingPrice;
            System.out.println("By " + loss + "$ you made a Loss!");
        }
    }
}
