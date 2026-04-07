public class Task6 {
    public static void main(String[] args) {
        BankAccount[] accountsArray = new BankAccount[3];
        accountsArray[0] = new BankAccount("Ali", 150000);
        accountsArray[1] = new BankAccount("Sara", 220000);
        accountsArray[2] = new BankAccount("Zhenis", 50000);

        for (int i = 0; i < accountsArray.length; i++) {
            System.out.println(i + ": " + accountsArray[i].username + " | Balance: " + accountsArray[i].balance);
        }
    }
}
