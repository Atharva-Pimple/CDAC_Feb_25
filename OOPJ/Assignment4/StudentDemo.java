public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student("ABC");
        s1.marks[0]=70;
        s1.marks[1]=90;
        s1.marks[2]=80;

        s1.display();
        System.out.println("=========================");
        Student s2=new Student("XYZ");
        s2.marks[0]=78;
        s2.marks[1]=89;
        s2.marks[2]=67;

        s2.display();
    }
}

class Student {
    String name;
    int[] marks;

    public Student(String name) {
        this.name = name;
        this.marks=new int[3];
    }

    int totalMarks(){
        int total=0;
        for(int mark: marks){
            total += mark;
        }

        return total;
    }

    float averageMarks(){
        return this.totalMarks()/3;
    }

    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Total Marks: "+this.totalMarks());
        System.out.println("Average Marks: "+this.averageMarks());
    }

    
}
