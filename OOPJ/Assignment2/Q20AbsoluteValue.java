import java.util.Scanner;

public class Q20AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int absValue = (num < 0) ? -num : num;
        System.out.println("Absolute Value: " + absValue);
        
        sc.close();
    }
}
