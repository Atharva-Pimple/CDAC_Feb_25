import java.util.Scanner;

public class Q05SumAndAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        
        System.out.println("Sum of Array: "+sum);
        System.out.println("Average of elements: "+((double)sum/(double)n));

        sc.close();
    }
}
