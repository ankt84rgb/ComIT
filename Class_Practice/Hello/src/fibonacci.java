import java.util.Scanner;
public class fibonacci {
        public static void main(String[] args)
        {
            int previousNumber = 0, nextNumber = 1, temp = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int maxNumber = sc.nextInt();
            System.out.println("Fibonacci series up to : "+ maxNumber);

            while(maxNumber > 0)
            {
                System.out.print(previousNumber +" + ");
                temp = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = temp;
                maxNumber -= 1;
            }
    }
}
