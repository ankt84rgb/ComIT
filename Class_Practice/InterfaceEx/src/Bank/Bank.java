package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Manager manager;
    private List<Employee> listOfEmployees;// = new ArrayList<Employee>();
    private List<Account> listOfAccounts;// = new ArrayList<Account>();

    public Bank(Manager manager) {
        this.manager = manager;
        this.listOfEmployees = new ArrayList<>();
        this.listOfAccounts = new ArrayList<>();
    }
    public void hireEmployee(Employee employee){
        this.listOfEmployees.add(employee);
    }
    public void fireEmployee(int employeeID){
        for (Employee e : listOfEmployees) {
            if(e.getId() == employeeID)
                listOfEmployees.remove(e);
        }
    }
    public void addAccount(Account account){
        listOfAccounts.add(account);
    }
//    public void removeAccount(int acntNumber){
//        listOfAccounts.stream()
//                .filter(a -> a.getNumber() == acntNumber)
//                .findFirst()
//                .ifPresent(a -> listOfAccounts.remove((a)));
//    }
    public void removeAccount(int accountNumber){
        for (Account a: listOfAccounts) {
            if(a.getNumber() == accountNumber)
                listOfAccounts.remove(a);
        }
    }
}
