public class Pattern_13 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.print(i);
            for(int j=1;j<i;j++){
                System.out.print("*"+i);
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            System.out.print(i);
            for(int j=1;j<i;j++){
                System.out.print("*"+i);
            }
            System.out.println();
        }
    }
}
