public class Q19CharacterCheck {
    public static void main(String[] args) {
        char ch = 'A';
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
                (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a Letter";
        System.out.println(result);
    }
}
