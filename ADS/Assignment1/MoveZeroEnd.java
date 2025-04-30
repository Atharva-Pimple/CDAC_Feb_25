import java.util.Arrays;
public class MoveZeroEnd {
    public static void main(String[] args) {
        // int[] arr={10, 0, 5, 20, 0, 8, 15, 0, 0};
        int[] arr={10, 0, 5, 20, 0, 8, 15};
        int n=arr.length;

        int i=0;
        int j=n-1;
        while(arr[j]==0){
            j--;
        }
        while(i<j){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
