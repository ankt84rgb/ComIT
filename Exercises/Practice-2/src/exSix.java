/*6 - Write a program in JAVA that takes as input a salary, apply a 15% increase
if the salary is less than $ 1000 and 12% otherwise. Print the new salary.*/

import java.util.Scanner;

public class exSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        float newSalary = 0;
        int salary = sc.nextInt();
        if (salary <= 1000)
            newSalary = salary + (salary * 0.15f);
        else
            newSalary = salary + (salary * 0.12f);

        System.out.println("New salary is : " + newSalary);

    }
}
