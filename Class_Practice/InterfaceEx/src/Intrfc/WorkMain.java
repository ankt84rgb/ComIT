package Intrfc;

public class WorkMain {
    public static void main(String[] args) {
        Employee john = new Employee(11, "John Wick", 11);
        Manager mike = new Manager(55, "Mark Dawson", 3300);

        Account johnsAccount = new Account(111, 0, john);
        Account mikesAccount = new Account(222, 0, mike);

        int jearned = john.work(8);
        int mearned = mike.work(10);
        try {
            johnsAccount.transaction(jearned);
            mikesAccount.transaction(mearned);
        }catch (Exception e){
            System.out.println("Don't steal his money...!");
        }
        System.out.println(johnsAccount.getBalance());
        System.out.println(mikesAccount.getBalance());


    }
}
