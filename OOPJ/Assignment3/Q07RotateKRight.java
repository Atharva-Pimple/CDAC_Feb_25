import java.util.Scanner;

public class Q07RotateKRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k value:");
        int k=sc.nextInt();
        sc.close();

        int[] newArr=new int[n];
        int j=k;
        for(int i=0;i<n;i++){
            newArr[j]=arr[i];
            j=(j+1)%n;
        }

        System.out.println("After rotating to right by "+k+" elements");
        for(int i=0;i<n;i++){
            System.out.print(newArr[i]+" ");
        }

    }
}
