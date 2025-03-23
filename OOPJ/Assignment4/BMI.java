import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in Kg: ");
        double w=sc.nextDouble();
        System.out.print("Enter height in m: ");
        double h=sc.nextDouble();
        BMICalculator cal=new BMICalculator();
        cal.setHeight(h);
        cal.setWeight(w);
        double bmi=cal.calculateBMI();

        System.out.printf("BMI: %.2f",bmi);

        sc.close();
    }
}

class BMICalculator {
    private double height;
    private double weight;

    public BMICalculator() {
        this.height = 0;
        this.weight = 0;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double calculateBMI(){
        return weight / (height * height);
    }

    
}
