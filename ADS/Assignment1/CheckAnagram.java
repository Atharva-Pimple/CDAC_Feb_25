import java.util.HashMap;

public class CheckAnagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int n=s1.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n;i++){
            char ch=s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }else{
                return false;
            }
        }
        return map.size()==0;
    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        String res=isAnagram(s1, s2) ?"Yes" : "No";
        System.out.println(s1+" and "+s2+" is Anagram: "+res);
    }
}
