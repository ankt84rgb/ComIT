import java.util.Scanner;

public class SumUsingFor {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 0; i <= num ; i++)
            sum = sum + i;
        System.out.println("Sum is: "+ sum);
    }
}
