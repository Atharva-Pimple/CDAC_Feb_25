public class LongestWord {
    public static void main(String[] args) {
        String sentence="Practice makes a man perfect";
        String[] arr=sentence.trim().split(" ");
        int n=arr.length;

        String word="";
        int wordL=0;
        for(int i=0;i<n;i++){
            if(arr[i].length()>wordL){
                word=arr[i];
                wordL=arr[i].length();
            }
        }

        System.out.println("Longest word: "+word);
    }
}
