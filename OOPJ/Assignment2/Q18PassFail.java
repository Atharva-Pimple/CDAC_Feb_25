import java.util.Scanner;

public class Q18PassFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Percentage:");
        float percentage = sc.nextFloat();
        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println(result);
        sc.close();
    }
}
