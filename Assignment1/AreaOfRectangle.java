import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of Rectangle:");
        int length=sc.nextInt();
        System.out.println("Enter bredth of Rectangle:");
        int bredth=sc.nextInt();

        int area=length*bredth;

        System.out.println("The area of Rectangle is: "+area);

        sc.close();
    }
}
