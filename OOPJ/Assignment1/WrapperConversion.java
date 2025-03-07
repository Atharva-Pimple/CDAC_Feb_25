public class WrapperConversion {
    public static void main(String[] args) {
        Integer intValue = 10;
        Double doubleValue = intValue.doubleValue(); 

        System.out.println("Integer to Double: " + doubleValue);

        Double dValue = 20.5;
        Integer iValue = dValue.intValue(); 

        System.out.println("Double to Integer: " + iValue);
    }
}
