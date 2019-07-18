import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc = new Scanner(System.in);
        String[] names = {"Guitars", "Pianos", "Keyboards","Trumpets","Saxophones","Drums","Banjos","Maracas","Flutes"
        ,"Xylophones"};
        float[] prices = {10,20,30,40,50,60,70,80,90,100};
        int[] numBought = new int[10];

        for (int count = 0; count < names.length; count++) {
            System.out.printf("%-3d %-15s %.2f\n", count, names[count], prices[count]);
        }
        String answer = null;
        do {
            System.out.println("Please enter ID of the product you want to purchase: ");
            int tempID = sc.nextInt();
            System.out.println("How many number of products you want to purchase: ");
            int tempNo = sc.nextInt();
            numBought[tempID] = tempNo;
            System.out.println("Do you want to add another product: ");
            answer = sc.next();
        }while( answer.equals("yes"));

        System.out.printf("%-15s \t %-15s \t %-15s \t %-25s\n","Product Name", "Product Price", "Total no of Items", "Total Price");
        for (int i = 0; i < names.length; i++) {
            if (numBought[i] > 0)
                System.out.printf("%-15s \t %-15.2f \t %-15d \t %-25.2f\n",names[i], prices[i], numBought[i], numBought[i]*prices[i]);
        }
    }
}
