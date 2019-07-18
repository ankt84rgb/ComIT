import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myNumber = 100;
        char myChar = 'A';
        String myString = "Hello, How are you ?";
        Float pi = 3.1415f;
        System.out.println(myNumber);
        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(pi);
        System.out.println("-------------------------");
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter a string: ");
        //String line = scan.nextLine();
        System.out.println("Please enter an integer: ");
        int number = scan.nextInt();
        System.out.println("You entered: " + number);
    }
}
