import java.util.Scanner;

public class Q9RangeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        String bool=(num<20) || (num>50) ? "Not in range 20..50" : "Within range of 20..50";
        System.out.println(bool);
        sc.close();
    }
}
