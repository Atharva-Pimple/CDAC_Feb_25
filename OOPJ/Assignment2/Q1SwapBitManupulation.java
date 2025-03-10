import java.util.Scanner;

public class Q1SwapBitManupulation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num1=sc.nextInt();
        System.out.println("Enter a Number:");
        int num2=sc.nextInt();

        num1=num1 ^ num2;
        num2=num1 ^ num2;
        num1=num1 ^ num2;

        System.out.printf("Num1 is %d %n",num1);
        System.out.printf("Num2 is %d",num2);

        sc.close();
    }
}