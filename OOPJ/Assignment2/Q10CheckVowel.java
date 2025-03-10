import java.util.Scanner;

public class Q10CheckVowel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an char:");
        String ch=sc.next();

        String vowels="aeiouAEIOU";
        if(vowels.contains(ch)){
            System.out.println(ch+" is an vowel.");
        }else{
            System.out.println(ch+" is not an vowel.");
        }
        sc.close();
    }
}