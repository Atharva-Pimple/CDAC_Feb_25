public class Pattern_21 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            int count=1;
            System.out.print(count);
            for(int j=1;j<i;j++){
                count+=2;
                System.out.print("*"+count);
            }
            System.out.println();
        }
    }
}
