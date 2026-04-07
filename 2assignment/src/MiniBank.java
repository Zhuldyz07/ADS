import java.util.*;
public class MiniBank{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList<BankAccount> accounts = new LinkedList<>();
        accounts.add(new BankAccount("Ali", 150000));
        accounts.add(new BankAccount("Sara", 220000));

        Stack<String> history = new Stack<>();
        Queue<String> accountRequests = new LinkedList<>();
        Queue<String> billQueue = new LinkedList<>();

        billQueue.add("Electricity Bill");
        billQueue.add("Internet Bill");

        while (true) {
            System.out.println("\n===== WELCOME TO SYSTEM =====");
            System.out.println("1 - Enter Bank");
            System.out.println("2 - Enter ATM");
            System.out.println("3 - Admin Area");
            System.out.println("4 - Exit");
            System.out.print("Your choice: ");
            int mainOption = in.nextInt();
            in.nextLine();

            if (mainOption == 1) {
                System.out.println("\n--- BANK MENU ---");
                System.out.println("1. Open Account Request");
                System.out.println("2. Deposit Cash");
                System.out.println("3. Withdraw Cash");
                System.out.print("Action: ");
                int bankOp = in.nextInt();
                in.nextLine();

                if (bankOp == 1) {
                    System.out.print("Client Name: ");
                    String name = in.nextLine();
                    accountRequests.add(name + "'s New Account");
                    System.out.println("Request sent to Admin.");
                } else if (bankOp == 2 || bankOp == 3) {
                    System.out.print("Account Name: ");
                    String name = in.nextLine();
                    for (BankAccount acc : accounts) {
                        if (acc.username.equalsIgnoreCase(name)) {
                            System.out.print("Amount: ");
                            double sum = in.nextDouble();
                            if (bankOp == 2) {
                                acc.balance += sum;
                                history.push("Deposit " + sum + " to " + name);
                            } else {
                                acc.balance -= sum;
                                history.push("Withdraw " + sum + " from " + name);
                            }
                            System.out.println("Success! Balance: " + acc.balance);
                        }
                    }
                }

            } else if (mainOption == 2) {
                System.out.println("\n--- ATM MENU ---");
                System.out.print("Enter your name: ");
                String name = in.nextLine();
                for (BankAccount acc : accounts) {
                    if (acc.username.equalsIgnoreCase(name)) {
                        System.out.println("1. Check Balance\n2. Withdraw 10000");
                        int atmOp = in.nextInt();
                        if (atmOp == 1) {
                            System.out.println("Your Balance: " + acc.balance);
                        } else {
                            acc.balance -= 10000;
                            history.push("ATM Withdraw 10000 - " + name);
                            System.out.println("Done. Take your cash.");
                        }
                    }
                }

            } else if (mainOption == 3) {
                System.out.println("\n--- ADMIN MENU ---");
                System.out.println("1. Process Account Queue");
                System.out.println("2. View Bill Payment Queue");
                int adminOp = in.nextInt();

                if (adminOp == 1) {
                    if (!accountRequests.isEmpty()) {
                        System.out.println("Working on: " + accountRequests.poll());
                    } else {
                        System.out.println("No requests today.");
                    }
                } else if (adminOp == 2) {
                    System.out.println("Active Bills: " + billQueue);
                }

            } else if (mainOption == 4) {
                System.out.println("Shutdown...");
                break;
            }
        }
    }
}


