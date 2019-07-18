import java.util.Scanner;

public class arrayEx {
    public static void main(String[] args) {
//        int[] grades;
//        grades = new int[5];
//        grades[0] = 10;
//        grades[1] = 20;
//        grades[2] = 30;
//        grades[3] = 40;
//        grades[4] = 50;
        int sum = 0, avg = 0, temp = 0;
        int[] grades;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to enter: ");
        int noOfElements = sc.nextInt();

        grades = new int[noOfElements];

        System.out.println("Enter elements: ");
        for (int i = 0; i < grades.length; i++) {
            temp = sc.nextInt();
            grades[i] = temp;
        }
        for (int elements: grades) {
            sum += elements;
        }
        avg = sum / grades.length;
        System.out.println("Average is: " + avg);
    }
}
