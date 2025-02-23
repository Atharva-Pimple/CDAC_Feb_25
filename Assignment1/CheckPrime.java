import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        if(num==1){
            System.out.println(num +" is not Prime");
            sc.close();
            return;
        }

        for(int i=2;i*i <= num;i++){
            if(num%i ==0){
                System.out.println(num +" is not Prime");
                sc.close();
                return;
            }
        }

        System.out.println(num +" is Prime");

        sc.close();
    }
}
