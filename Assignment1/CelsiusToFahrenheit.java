import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        int temp=sc.nextInt();

        double f=(temp * 9/5) + 32;

        System.out.println(temp+"\u00B0C is equal to: "+f+"\u00B0F");

        sc.close();
    }
}
