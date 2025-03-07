import java.util.*;

public class VowelCheck {

    public static void main(String[] args) {
        
        String vowels="aeiouAEIOU";
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
        String s=sc.next();
        
        if(vowels.contains(s)){
            System.out.printf("%s is a vowel.",s);
        }else{
            System.out.printf("%s is a consonant.",s);
        }
    }
}