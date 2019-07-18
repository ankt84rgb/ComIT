import java.util.Scanner;

public class MainCoins {
    public static void main(String[] args) {
        final Coins nickle = new Coins("nickle",5);
        Coins dime = new Coins("dime", 10);
        Coins quarter = new Coins("quarter", 25);
        Coins loonie = new Coins("loonie", 100);
        Coins twoonie = new Coins("twoonie", 200);

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter amount: ");
        int tempValue = sc.nextInt();
//        int numNickle, numDime, numQuarter, numLoonie, numTwoonie;
        System.out.println("numTwoonie =" + twoonie.coinsNeeded(tempValue));
        System.out.println("numLoonie =" + loonie.coinsNeeded(tempValue));
        System.out.println("numQuarter =" + quarter.coinsNeeded(tempValue));
        System.out.println("numDime =" + dime.coinsNeeded(tempValue));
        System.out.println("numNickle =" + nickle.coinsNeeded(tempValue));
    }
}
