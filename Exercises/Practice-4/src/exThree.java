import java.util.Scanner;

public class exThree {
    public static void main(String[] args) {
        int[] salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of workers: ");
        int noOfWorkers = sc.nextInt();
        salary = new int[noOfWorkers];

        System.out.println("Enter salary of all the workers: ");

        for (int count = 0; count < salary.length; count++) {
            salary[count] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max)
                max = salary[i];
        }
        System.out.println("Maximum salary is: "+max);
    }
}
