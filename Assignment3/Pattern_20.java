public class Pattern_20 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int count=5;
            System.out.print(count);
            for(int j=1;j<i;j++){
                count--;
                System.out.print("*"+count);
            }
            System.out.println();
        }
    }
}
