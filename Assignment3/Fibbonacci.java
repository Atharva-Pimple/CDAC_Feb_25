public class Fibbonacci {
    public static void main(String[] args) {
        System.out.print("Fibonacci sequence up to 21: ");
        int a = 0, b = 1;
        while (a <= 21) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}
