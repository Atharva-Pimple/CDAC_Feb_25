import java.util.Scanner;

public class Factorial {

    private static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();

        int fact=factorial(n);

        System.out.println("Factorial of "+n+": "+fact);

        sc.close();
    }
}
