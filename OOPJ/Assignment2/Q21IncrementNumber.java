import java.util.Scanner;

public class Q21IncrementNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        num= -(~num);
        System.out.println("After incrementation: "+num);
        sc.close();
    }
}
