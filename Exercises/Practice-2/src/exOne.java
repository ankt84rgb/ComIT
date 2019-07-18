/*1 - Write a program in Java that reads two numbers on the keyboard and say which is the largest
and which is the smallest.*/

import java.util.Scanner;

public class exOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println("First number is greater than second one...!");
        else
            System.out.println("First number is less than second one...!");


    }
}
