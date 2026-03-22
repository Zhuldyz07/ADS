import java.util.Scanner;
public class Task9 {
    public static int count(String s){
        if(s.isEmpty()) return 0;
        return 1 + count(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.next()));
    }
}
