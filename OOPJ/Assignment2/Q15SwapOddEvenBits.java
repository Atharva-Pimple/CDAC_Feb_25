import java.util.Scanner;

public class Q15SwapOddEvenBits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entyr a number:");
        int num=sc.nextInt();

        int evenBits = (num & 0xAAAAAAAA) >> 1; 
        int oddBits = (num & 0x55555555) << 1;  
        int res= evenBits | oddBits;

        System.out.println("After swapping bits: "+res);

        sc.close();
    }
}