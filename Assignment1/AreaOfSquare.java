import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side length of square:");
        int side=sc.nextInt();

        int area=side*side;

        System.out.println("The area of square is: "+area);

        sc.close();
    }
}
