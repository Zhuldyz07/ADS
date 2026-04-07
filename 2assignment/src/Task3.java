import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        history.push("Deposit 50000 to Ali");
        System.out.println("Deposit 50000 to Ali");
        history.push("Withdraw 20000 from Ali");
        System.out.println("Withdraw 20000 from Ali");

        System.out.println("Last transaction: " + history.peek());
        String lastAction = history.pop();
        String actionName = lastAction.split(" ")[0];
        System.out.println("Undo -> " + actionName + " removed");
    }
}
