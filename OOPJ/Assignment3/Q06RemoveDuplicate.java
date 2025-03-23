public class Q06RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6,6,7,8,9};

        int l=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[l]){
                l++;
                arr[l]=arr[i];
            }
        }

        System.out.println("Non duplicate array:");
        for(int i=0;i<=l;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
