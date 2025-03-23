import java.util.Scanner;

public class Q04EvenOddCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int evens=0;
        int odds=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evens++;
            }else{
                odds++;
            }
        }

        System.out.printf("Count of evens: %d and odds: %d",evens,odds);

        sc.close();
    }
}
