import java.util.Scanner;

public class Q11PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        if((num & (num-1))==0){
            System.out.println(num+" is a power of two");
        }else{
            System.out.println(num+" is not a power of two");
        }

        sc.close();
    }
}
