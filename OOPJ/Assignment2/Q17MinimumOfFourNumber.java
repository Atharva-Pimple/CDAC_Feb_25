import java.util.Scanner;

public class Q17MinimumOfFourNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=sc.nextInt();
        System.out.println("Enter a Number:");
        int b=sc.nextInt();
        System.out.println("Enter a Number:");
        int c=sc.nextInt();
        System.out.println("Enter a Number:");
        int d=sc.nextInt();

        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d)) 
                          : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
        System.out.println("Minimum: " + min);

        sc.close();
    }
}
