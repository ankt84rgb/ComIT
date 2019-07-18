import java.util.Scanner;

public class Inventory{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the type of product received :");
        String product = scanner.nextLine();
        System.out.println("Please enter the cost to us for reach : ");
        int cost = scanner.nextInt();
        System.out.println("Please enter the type of brand name : ");
        String brandName = scanner.next();
        System.out.println("Please enter the no of items in the shipments : ");
        int noInShipment = scanner.nextInt();

//        System.out.println(" ***** Shipment Summary ****");
//        System.out.println("The new product is " + product);
//        System.out.println("The shipment included " + noInShipment + " from " + brandName);
//        System.out.println();
//        System.out.println("The total value of the shipment including GST is " + ((noInShipment * cost) * 1.05));

        System.out.println(" ***** Shipment Summary ****\n" +
                "The new product is " + product + "\n" +
                "The shipment included " + noInShipment + " from " + brandName + "\n" +
                "The total value of the shipment is $" + (noInShipment * cost) + "\n" +
                "The total value of the shipment including GST is $" + ((noInShipment * cost) * 1.05) + "\n"
                );
    }
}