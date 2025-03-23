public class Q08MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};

        int m=arr1.length;
        int n=arr2.length;

        int[] newArr=new int[m+n];

        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                newArr[k++]=arr1[i++];
            }else{
                newArr[k++]=arr2[j++];
            }
        }

        while(i<m){
            newArr[k++]=arr1[i++];
        }

        while(j<n){
            newArr[k++]=arr2[j++];
        }

        System.out.println("After merging arrays:");
        for(int ele=0;ele<newArr.length;ele++){
            System.out.print(newArr[ele]+" ");
        }
    }
}
