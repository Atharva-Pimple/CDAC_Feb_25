import java.util.Scanner;

public class First_N_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
