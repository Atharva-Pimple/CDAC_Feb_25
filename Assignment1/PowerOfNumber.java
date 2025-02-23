import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter base number:");
        int base=sc.nextInt();

        System.out.println("Enter exponent number:");
        int exp=sc.nextInt();

        int ans=(int)Math.pow(base, exp);

        System.out.println(base+" raised to the power "+exp+" is "+ans);

        sc.close();
    }
}
