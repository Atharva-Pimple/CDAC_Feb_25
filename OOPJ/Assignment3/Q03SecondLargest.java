import java.util.Scanner;

public class Q03SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest=0;
        int secondLargest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }

            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }

        System.out.println("Second Largets element is "+secondLargest);

        sc.close();
    }
}
