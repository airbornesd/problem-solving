package questions;

import java.util.Scanner;

public class question008 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // this is a slight bug in java
        // when we take int before string, Scanner class handles new line
        // as if you are giving blank space to string
        // to resolve this there are two ways;
        // one just write scn.nextLine(); after taking int value
        // or using Integer.parseInt(scn.nextLine())


        int age = scn.nextInt();
        String name = scn.nextLine();
        System.out.println("Hello " + name + ". your age is " + age);

        System.out.println("1-------------------------------------------------------");

        //one way
        int age1 = scn.nextInt();
        scn.nextLine();
        String name1 = scn.nextLine();
        System.out.println("Hello " + name1 + ". your age is " + age1);

        System.out.println("2-------------------------------------------------------");

        // second way
        int age2 = Integer.parseInt(scn.nextLine());
        String name2 = scn.nextLine();
        System.out.println("Hello " + name2 + ". your age is " + age2);
    }
}
