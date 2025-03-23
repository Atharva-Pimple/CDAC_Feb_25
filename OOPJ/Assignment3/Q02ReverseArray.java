import java.util.Scanner;

public class Q02ReverseArray {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int l=0;
        int r=n-1;

        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;

        }

        System.out.println("After reversing an array:");
        printArray(arr);


        sc.close();

    }
}
