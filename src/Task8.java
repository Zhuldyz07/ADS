import java.util.Scanner;
public class Task8 {
    public static String check(String s){
        if(s.isEmpty())return "Yes";
        if(!Character.isDigit(s.charAt(0)))return "No";
        return check(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(check(sc.next()));
    }
}
