import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int c=num;
        int count=0;
        while(num>0){
            count++;
            num /=10;
        }

        System.out.println("The number "+c+" has "+count+" digits.");

        sc.close();
    }
}
