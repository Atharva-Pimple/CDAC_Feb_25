import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num=sc.nextInt();

        int rev=0;
        while (num>0) {
            int l=num%10;
            rev =rev*10 + l;
            num /=10;
        }

        System.out.println("Reversed Number is: "+rev);

        sc.close();
    }
}
