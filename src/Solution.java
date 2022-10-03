import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public boolean proveAnagram(String s1,String s2){

        char[]ch1 = s1.toCharArray();
        char[]ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (s1.length() !=s2.length()){
            return false;
        }

        //Hashmap 1

        HashMap<Character,Integer>hmp = new HashMap<>();
        //Mapping first hashmap
        for (int i=0;i<ch1.length;i++){
            if (hmp.get(ch1[i])==null){
                hmp.put(ch1[i],1);
            }
            else {
                Integer c = hmp.get(ch1[i]);
                hmp.put(ch1[i],++c);
            }
        }

        //Mapping hashmap 2
        HashMap<Character,Integer>hm2 = new HashMap<>();
        //mapping second hashmap
        for (int j=0;j<ch2.length;j++){
            if (hm2.get(ch2[j])==null){
                hm2.put(ch2[j],1);
            }
            else {
                Integer d = hm2.get(ch2[j]);
                hm2.put(ch2[j],d++);
            }
        }
        if (hmp.equals(hm2)){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String st = "wed";
        String t = "ewd";
        System.out.println(s.proveAnagram(st,t));
    }
}
