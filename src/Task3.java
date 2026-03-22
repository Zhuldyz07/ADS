import java.util.Scanner;
public class Task3 {
    public static String isPrime(int n,int i){
        if(n<=2) return (n==2)? "Prime" : "Composite";
        if(n%i==0) return "Composite";
        if(i*i>n) return "Prime";
        return isPrime(n,i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n,2));
    }
}
