package Bank;

public class BankMain {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Mike", 2000);
        Bank rbc = new Bank(manager);

        Employee Emp1 = new Employee(1, "Emp-1", 10);
        rbc.hireEmployee(Emp1);

        Account Emp1Account = new Account(111, 0, Emp1);
        rbc.addAccount(Emp1Account);

        rbc.fireEmployee(1);
    }
}
