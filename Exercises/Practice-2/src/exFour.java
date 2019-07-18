/*4 - Write a java program that declares an integer variable B and assign it a value.
It then displays a message indicating whether the value of B is positive or negative.
We will consider 0 as positive.*/

import java.util.Scanner;

public class exFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        if (num >= 0)
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");
    }
}
