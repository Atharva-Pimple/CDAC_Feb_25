import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Num 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Num 2:");
        int num2=sc.nextInt();

        int temp=num2;
        num2=num1;
        num1=temp;

        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);

        sc.close();
    }
}
