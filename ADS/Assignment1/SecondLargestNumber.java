public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr={10, 0, 5, 20, 0, 8, 15};
        int n=arr.length;
        int largest=arr[0];
        int secondL=-1;

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondL=largest;
                largest=arr[i];
            }else if(arr[i]>secondL){
                secondL=arr[i];
            }
        }

        System.out.println("Second Largest Number is "+secondL);
    }
}