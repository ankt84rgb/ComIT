//9 - Write a program in Java that reads an integer from the keyboard and makes the sum of the
// next 100 numbers, showing the result on screen.

import java.util.Scanner;

public class exNine {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int num = sc.nextInt();

        for (int i = num; i <= (num + 100); i++) {
            sum = sum + i;
        }
        System.out.println("Summation for the range "+ num + " - " + (num + 100) + " is :"+sum);
    }
}
