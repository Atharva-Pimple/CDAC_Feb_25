import java.util.HashSet;
import java.util.Set;

public class Q10IntersectionAndUnion {
    public static void main(String[] args) {
        Set<Integer> union=new HashSet<>();
        Set<Integer> intersect=new HashSet<>();
        Set<Integer> set=new HashSet<>();

        int[] arr1={2,5,7,3,5,1,9,8,34,76,6};
        int[] arr2={3,7,4,6,9,2,65,2};

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
            union.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            union.add(arr2[j]);
            if(set.contains(arr2[j])){
                intersect.add(arr2[j]);
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersect);
    }
}
