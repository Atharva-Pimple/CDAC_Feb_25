import java.util.Scanner;

public class Q14AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int num=sc.nextInt();
        int mask = num >> 31; // mask=-1 for negative and 0 for positive number
        int result=(num + mask) ^ mask;
        System.out.println("Absolute value is: "+ result);

        sc.close();
    }
}
