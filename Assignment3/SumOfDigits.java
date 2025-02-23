public class SumOfDigits {
    public static void main(String[] args) {
        int numberToSumDigits = 9876;
        int digitSum = 0;
        while (numberToSumDigits != 0) {
            digitSum += numberToSumDigits % 10;
            numberToSumDigits /= 10;
        }
        System.out.println("Sum of digits: " + digitSum);
    }
}
