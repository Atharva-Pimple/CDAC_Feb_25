import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Electricity units: ");
        double units=sc.nextDouble();

        ElectricityBill bill=new ElectricityBill(name, units);
        try{
            bill.calculateBillAmount();
            System.out.println(name+" Electricity bill will be "+bill.billAmount);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    void calculateBillAmount() throws Exception{
        if(unitsConsumed<=0){
            throw new Exception("Invalid units");
        }
        if(unitsConsumed>100){
            billAmount += 100*5;
            unitsConsumed -=100;
        }else{
            billAmount+= unitsConsumed*5;
            return;
        }

        if(unitsConsumed>200){
            billAmount += 200*7;
            unitsConsumed -=200;
        }else{
            billAmount+= unitsConsumed*7;
            return;
        }

        if(unitsConsumed>0){
            billAmount += unitsConsumed*10;
        }
        
    }
    
}