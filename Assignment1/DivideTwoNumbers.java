import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Dividend Num:");
        int divd=sc.nextInt();
        System.out.println("Enter Divisor Num:");
        int divs=sc.nextInt();

        float ans=divd/divs;

        System.out.println(divd+" / "+divs +" = "+ ans);

        sc.close();
    }
}
