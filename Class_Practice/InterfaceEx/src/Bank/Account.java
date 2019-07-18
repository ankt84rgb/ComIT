package Bank;

public class Account {
    private int number;
    private int balance;
    private Workable owner;

    public Account(int number, int balance, Workable owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void transaction(int amount) throws Exception{
        int result = balance + amount;
        if(result > 0){
            balance = result;
        }
        else
            throw new Exception("Can't withdraw below $0");
    }

}