import java.util.Scanner;

public class Q23EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();

        String out= (num & 1)==1 ? "The number is odd" : "The number is even";
        System.out.print(out);

        sc.close();
    }
}
