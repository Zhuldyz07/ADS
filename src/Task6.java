import java.util.Scanner;
public class Task6 {
    public static long power(long a, int n) {
        if (n==0) return 1;
        return a * power(a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }
}
