import java.util.Scanner;
public class Task7 {
    public static void reverse(Scanner sc,int n){
        if (n==0) return;
        int current = sc.nextInt();
        reverse(sc,n-1);
        System.out.print(current+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(sc,n);
    }
}
