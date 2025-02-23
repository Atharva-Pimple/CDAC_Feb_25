import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        int r=sc.nextInt();

        double Area= 3.14 * (r*r);

        System.out.println("Area of circle: "+Area);

        sc.close();
    }
}
