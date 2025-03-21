import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        int failedSubjects = 0;
        
        if (subject1 <= 40) {
            failedSubjects++;
        }
        if (subject2 <= 40) {
            failedSubjects++;
        }
        if (subject3 <= 40) {
            failedSubjects++;
        }
        
        if (failedSubjects == 0) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed in " + failedSubjects + " subject.");
        }

        sc.close();
    }
}

