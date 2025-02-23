public class Increment {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int result = ++x + y--;
        System.out.println("Result: " + result); 
        System.out.println("x: " + x); 
        System.out.println("y: " + y); 
    }
}
