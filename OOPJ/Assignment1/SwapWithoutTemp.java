import java.util.*;

public class SwapWithoutTemp {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number A:");
        int a=sc.nextInt();
		System.out.println("Enter number B:");
        int b=sc.nextInt();
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("Number A: %d %n",a);
		System.out.printf("Number B: %d",b);
        
        
    }
}