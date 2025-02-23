import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Num 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Num 2:");
        int num2=sc.nextInt();

        int sum=num1+num2;

        System.out.println("sum of "+num1+" and "+num2+" is "+sum);

        sc.close();
    }
}
