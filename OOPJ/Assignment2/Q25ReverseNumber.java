import java.util.Scanner;

public class Q25ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        
        int newNum=0;
        while(num>0){
            int last=num%10;
            num /= 10;
            newNum=(10 * newNum)+last;
        }

        System.out.println("The reverse number is: "+newNum);
        sc.close();
    }
}
