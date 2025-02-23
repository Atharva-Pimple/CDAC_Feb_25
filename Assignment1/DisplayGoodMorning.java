import java.util.Scanner;

public class DisplayGoodMorning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Time");
        int time=sc.nextInt();

        if(time <= 12 && time>=5){
            System.out.println("Good Morning");
        }

        sc.close();
    }
}
