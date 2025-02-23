import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total Amount:");
        int amt=sc.nextInt();
        System.out.println("Do you have an membership card (Yes or No):");
        String card=sc.next();
        sc.close();

        if(amt>=1000){
            amt *= 0.8;
        }else if(amt>=500){
            amt *= 0.9;
        }else{
            amt *= 0.95;
        }

        if(card.equalsIgnoreCase("yes")){
            amt *= 0.95;
        }

        System.out.println("After discount total amount is "+amt);
    }
}
