import java.util.Scanner;

public class Q6LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num1=sc.nextInt();
        System.out.println("Enter a Number:");
        int num2=sc.nextInt();
        System.out.println("Enter a Number:");
        int num3=sc.nextInt();

        int largest=(num1>num2) && (num1>num3) ? num1: ((num2>num3) ? num2: num3);

        System.out.println("Largets number is: "+largest);
        sc.close();   
    }
}
