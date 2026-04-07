import java.util.LinkedList;
import java.util.Queue;

public class Task5 {
    public static void main(String[] args) {
        Queue<String> accountRequests = new LinkedList<>();
        accountRequests.add("Ali's Account Request");
        accountRequests.add("Sara's Account Request");
        System.out.println("New requests added to queue.");

        System.out.println("Pending requests: "+accountRequests);

        String processedRequests = accountRequests.poll();
        System.out.println("Admin processsed: "+processedRequests);

        System.out.println("Requests left: "+accountRequests);
    }
}
