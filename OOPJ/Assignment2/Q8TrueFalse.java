import java.util.Scanner;

public class Q8TrueFalse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter True OR False:");
        String input1=sc.next();
        System.out.println("Enter True OR False:");
        String input2=sc.next();
        System.out.println("Enter True OR False:");
        String input3=sc.next();

        boolean f=input1.equalsIgnoreCase("true") ? true:false;
        boolean s=input2.equalsIgnoreCase("true") ? true:false;
        boolean t=input3.equalsIgnoreCase("true") ? true:false;

        if((f || s) && (s || t)){
            System.out.println("It's True");
        }else{
            System.out.println("It's False");
        }

        sc.close();
    }
}