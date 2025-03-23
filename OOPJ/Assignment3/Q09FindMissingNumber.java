public class Q09FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,5,4,2,6,9,3,7};
        int n=9;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        int sumNatural= n * (n+1) /2;
        int missing=sumNatural-sum;
        System.out.println("Missing number is "+missing);
    }
}
