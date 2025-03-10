import java.util.Scanner;

public class Q4DisibleOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        System.out.print(num);
        while(num > 0){
            num -=3;
        }
        if((num | 1) ==1){
            System.out.println(" is divisible by 3");
        }else{
            System.out.println(" is not divisible by 3");
        }
        sc.close();
    }
}
