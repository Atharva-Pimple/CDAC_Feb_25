import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of series");
        int n=sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        int i=0;
        while(i<n-2){
            int t=num1+num2;
            System.out.print(t+" ");
            num1=num2;
            num2=t;
            i++;
        }

        sc.close();
    }
}
