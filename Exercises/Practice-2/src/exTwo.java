import java.util.Scanner;

public class exTwo {
    public static void main(String[] args) {
        System.out.println("Enter the amount in CAN dollars: ");
        Scanner sc = new Scanner(System.in);
        int can = sc.nextInt();
        double usd = can * 1.34;
        System.out.println("Equivalent amount of CAN to USD is :" + usd);
        System.out.printf("\"Equivalent amount of CAN to USD is : %.2f\n", usd);

    }
}
