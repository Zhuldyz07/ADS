import java.util.Scanner;
public class Task2 {
    static Scanner sc = new Scanner(System.in);
    public static int readAndSum(int n){
        if(n==0) return 0;
        int val = sc.nextInt();
        return val+readAndSum(n-1);
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        double average = (double) readAndSum(n)/n;
        System.out.println(average);
    }
}
