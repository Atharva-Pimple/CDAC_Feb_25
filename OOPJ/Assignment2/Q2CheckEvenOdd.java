import java.util.Scanner;

public class Q2CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();

        if((num & 1)==1){
            System.out.printf("%d is odd",num);
        }else{
            System.out.printf("%d is even",num);
        }

        sc.close();
    }
}
