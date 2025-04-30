public class CountVowelsConsonants {

    public static void main(String[] args) {
        String str="Practice makes a man perfect";
        int n=str.length();

        String vowels="AEIOUaeiou";

        int vowelsCount=0;
        for(int i=0;i<n;i++){
            String ch=String.valueOf(str.charAt(i));
            if(vowels.contains(ch)){
                vowelsCount++;
            }
        }

        int consonantsCount=n-vowelsCount;

        System.out.println("Vowels count: "+vowelsCount);
        System.out.println("Consonants count: "+consonantsCount);
    }
}