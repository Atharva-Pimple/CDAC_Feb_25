import java.util.Scanner;

public class BasicArithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Num 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Num 2:");
        int num2=sc.nextInt();


        System.out.println(num1+" + "+num2+" = "+ (num1+num2));
        System.out.println(num1+" - "+num2+" = "+ (num1-num2));
        System.out.println(num1+" x "+num2+" = "+ (num1*num2));
        System.out.println(num1+" / "+num2+" = "+ (num1/num2));
        System.out.println(num1+" mod "+num2+" = "+ (num1%num2));

        sc.close();
    }
}
