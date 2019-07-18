import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {

            System.out.println("Enter a number : ");
            int num = sc.nextInt();

            //System.out.println("Student's average is : "+ avg);
            if ((num & 1) == 1)
                System.out.println("*** Odd Number ***");
            else
                System.out.println("*** Even Number ***");

/*        if (num % 2 == 0)
            System.out.println("\nEven Number");
        else
            System.out.println("\nOdd Number");*/
            System.out.println("Do you want to continue: Enter 'y' or 'n'.....!");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
    }
}
