import java.util.LinkedList;
public class Task1 {
    public static void main(String[] args) {
        LinkedList<BankAccount> accounts = new LinkedList<>();
        accounts.add(new BankAccount("Ali", 150000));
        accounts.add(new BankAccount("Sara", 220000));

        System.out.println("Accounts added successfully");
        System.out.println("Accounts List");

        int i = 1;
        for (BankAccount acc : accounts) {
            System.out.println(i + ". " + acc.username + " - Balance: " + acc.balance);
            i++;
        }
    }
}


