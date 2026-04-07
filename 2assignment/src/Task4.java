import java.util.LinkedList;
import java.util.Queue;

public class Task4 {
    public static void main(String[] args) {
        Queue<String> billqueue = new LinkedList<>();

        billqueue.add("Electricity Bill");
        System.out.println("Added: Electricity Bill");
        billqueue.add("Intenet Bill");
        System.out.println("Added: Intenet Bill");

        String processed = billqueue.poll();
        System.out.println("Processing: " + processed);
        System.out.println("Remaining: " + billqueue);
    }
}
