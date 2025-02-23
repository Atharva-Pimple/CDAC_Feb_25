import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Num 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Num 2:");
        int num2=sc.nextInt();
        System.out.println("Enter Num 3:");
        int num3=sc.nextInt();

        int average=(num1+num2+num3)/3;
        System.out.println("Average of "+num1+" "+num2+" "+num3+" ="+average);
        sc.close();
    }
}
