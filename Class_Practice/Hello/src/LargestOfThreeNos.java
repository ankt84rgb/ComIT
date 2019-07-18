import java.util.Scanner;

public class LargestOfThreeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter a three numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if ( (num1 > num2) && (num1 > num3))
                System.out.println(num1 + " is greatest number");
            else if(num2 > num3)
                System.out.println(num2 + " is greatest number");
            else
                System.out.println(num3 + " is greatest number");


            System.out.println("Do you want to continue: Enter 'y' or 'n'.....!");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
    }
}
