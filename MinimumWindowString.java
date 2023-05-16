import java.util.*;
public class MinimumWindowString {
    

    public static void main(String args[]){
        HashMap<Character , Integer> map = new HashMap<>();
        String s="ADOBECODEBANC";
        String t="ABC";
        String ans="";
        int min=100, l=0, u=0,count = t.length();
        for(int i=0; i<t.length(); i++){
            if(!map.containsKey(t.charAt(i)))
            map.put(t.charAt(i),1);
            else
            map.put(t.charAt(i), map.get(t.charAt(i))+1);
        }
         while(u<s.length() ){                     
            if(map.containsKey(s.charAt(u))){
                map.put(s.charAt(u), map.get(s.charAt(u))-1);

                if(map.get(s.charAt(u))>=0)
                count--;
            
              }

              while(count == 0){
                if(u-l+1 < min){
                    min = u-l+1;
                    ans = s.substring(l,u+1);
                }
                if(map.containsKey(s.charAt(l))){
                    if(map.get(s.charAt(l)) >= 0)
                    count++;

                    map.put(s.charAt(l), map.get(s.charAt(l))+1);
                }
                l++;
            }

            u++;         
            
         }

        System.out.print(ans+" "+min);
    }
}
