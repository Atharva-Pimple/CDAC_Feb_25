import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2:");
        int num2=sc.nextInt();
        System.out.println("Enter an operator (+, -, *, /): ");
        String opr=sc.next();
        sc.close();

        if(opr.equals("/") && num2==0){
            System.out.println("dividing "+num1+" by 0 is not possible!!!");
            return;
        }

        switch (opr) {
            case "+":
                System.out.println(num1+" "+opr+" "+num2+" = "+(num1+num2));
                break;
            case "-":
                System.out.println(num1+" "+opr+" "+num2+" = "+(num1-num2));
                break;
            case "*":
                System.out.println(num1+" "+opr+" "+num2+" = "+(num1*num2));
                break;
            case "/":
                System.out.println(num1+" "+opr+" "+num2+" = "+(num1/num2));
                break;
            default:
                break;
        }
    
        
        
    }
}
