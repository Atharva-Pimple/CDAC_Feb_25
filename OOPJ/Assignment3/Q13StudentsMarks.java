import java.util.Scanner;

class Student{
    int physics;
    int chemistry;
    int maths;

    Student(int physics, int chemistry, int maths) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    double aggregate(){
        int sum=this.chemistry+this.physics+this.maths;
        double percetage=(sum/300)*100;
        return percetage;
    }

}
public class Q13StudentsMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student[] arr=new Student[20];
        System.out.println("Enter Student marks:");

        for(int i=0;i<20;i++){
            System.out.println("Enter student_"+ (i+1)+" Marks");
            System.out.print("Enter Physics marks:");
            int physics=sc.nextInt();
            System.out.print("Enter Chemistry marks:");
            int chemistry=sc.nextInt();
            System.out.print("Enter Maths marks:");
            int maths=sc.nextInt();

            arr[i]=new Student(physics, chemistry, maths);

        }

        
    }
}
