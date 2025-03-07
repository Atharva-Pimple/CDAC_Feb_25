import java.util.*;

public class SwapWithTemp {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number A:");
        int a=sc.nextInt();
		System.out.println("Enter number B:");
        int b=sc.nextInt();
		
		int temp=a;
		a=b;
		b=temp;
		System.out.printf("Number A: %d %n",a);
		System.out.printf("Number B: %d",b);
        
        
    }
}