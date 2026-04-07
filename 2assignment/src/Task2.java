import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<BankAccount> accounts = new LinkedList<>();
        accounts.add(new BankAccount("Ali", 150000));
        accounts.add(new BankAccount("Sara", 220000));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String name = sc.nextLine();

        for (BankAccount acc : accounts) {
            if(acc.username.equalsIgnoreCase(name)) {
                System.out.println("Deposit: ");
                double amount = sc.nextDouble();
                acc.balance += amount;

                System.out.println("New balance: " + acc.balance);
            }
        }
    }
}
