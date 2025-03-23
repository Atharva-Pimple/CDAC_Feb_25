import java.util.Scanner;

public class Q12EvenOddMultiple3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=20;

        int[] arr=new int[n];
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int evens=0;
        int odds=0;
        int multi=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evens++;
            }else{
                odds++;
            }

            if(arr[i]!=0 && arr[i]%3==0){
                multi++;
            }
        }

        System.out.printf("Count of evens: %d and odds: %d",evens,odds);
        System.out.println("Multiple of 3: "+multi);

        sc.close();
    }
}
