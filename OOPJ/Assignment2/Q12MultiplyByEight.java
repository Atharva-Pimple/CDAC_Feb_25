import java.util.Scanner;

public class Q12MultiplyByEight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        int ans= (num << 3);
        System.out.println(num+" x 8= "+ans);

        sc.close();
    }
}
