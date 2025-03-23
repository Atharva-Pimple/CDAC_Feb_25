public class Q11SubarraySum {
    public static void printArray(int[] arr,int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,3,8,9,1,4,8,2,7};
        int sum=22;
        int n=arr.length;

         
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int cumSum=0;
                for(int k=i;k<=j;k++){
                    cumSum += arr[k];
                }

                if(cumSum==sum){
                    printArray(arr,i,j);
                }
            }
        }

        
    }
}
