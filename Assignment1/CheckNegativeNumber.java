import java.util.Scanner;

public class CheckNegativeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        if(num<0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Positive");
        }
        sc.close();
    }
}
