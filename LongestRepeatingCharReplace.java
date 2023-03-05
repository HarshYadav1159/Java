import java.util.Collections;
import java.util.HashMap;

import java.util.Map;

public class LongestRepeatingCharReplace {
    
    //Finds the character with max Frequency
    public static int maxFreq(HashMap<Character, Integer> map){
        int max = Collections.max(map.values());
        for(Map.Entry<Character, Integer> e: map.entrySet()){
           if(e.getValue() == max){
            return e.getValue();
           }
          }

        return 0;
    }
    

    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int l=0, res=0;

        for(int r=0; r < s.length();r++){
            if(map.containsKey(s.charAt(r)))
               map.put(s.charAt(r), map.get(s.charAt(r))+1);
            else
            map.put(s.charAt(r), 1);              

            while((r-l+1) - maxFreq(map) > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l=l+1;
            }

            res= Math.max(r-l+1, res);
        }
       
       

        
        return res;
   }

    public static void main(String args[]){
        String s = "ABAB";
        int a = characterReplacement(s, 1);
        System.out.println(a);

    }
    
}
