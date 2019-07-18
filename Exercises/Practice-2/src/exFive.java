/*Write a program in JAVA that takes as input the enrollment and 5 grades of a student; Print the
enrollment, the average and the word "approved" if the student has an average greater than or equal to 6,
 and the word "not approved" otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where:
 MAT is an integer variable that represents the student's enrollment.
 CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.
 */

import java.util.Scanner;

public class exFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter enrollment : ");
        int MAT = sc.nextInt();
        System.out.println("Enter 5 grades(1-10) : \n");
        float CAL1 = sc.nextFloat();
        float CAL2 = sc.nextFloat();
        float CAL3 = sc.nextFloat();
        float CAL4 = sc.nextFloat();
        float CAL5 = sc.nextFloat();

        float avg = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5)/5.0f;
        System.out.println("Student's average is : "+ avg);
        if (avg >= 6.0f)
            System.out.println("\nApproved");
        else
            System.out.println("\nNot Approved");
    }
}