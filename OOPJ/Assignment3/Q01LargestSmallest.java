public class Q01LargestSmallest {

    public static void main(String[] args) {
        int[] arr={3, 7, 90, 22, 6, 4, 4, 8, 9};

        int largest=0;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        System.out.println("Largest element: "+largest);
        System.out.println("Smallest element: "+smallest);
    }
}