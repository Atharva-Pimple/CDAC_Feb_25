public class ReverseDigit {
    public static void main(String[] args) {
        int numberToReverse = 1234;
        int reversedNumber = 0;
        while (numberToReverse != 0) {
            int digit = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numberToReverse /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
