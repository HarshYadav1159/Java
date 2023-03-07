import java.util.*;
public class GroupAnagram {
    
    public static String sort(String s){
              char[] ch = s.toCharArray();
              Arrays.sort(ch);
              return new String(ch);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList(); 
        List<String> list = new LinkedList<>();    
          
        HashMap<String, List<String>> map= new HashMap<>();

        for(int i =0; i<strs.length; i++){
            if(!map.containsKey(sort(strs[i]))){
                    map.put(sort(strs[i]), new LinkedList<>());
            }
        }

        for(int i=0; i<strs.length; i++){
            map.get(sort(strs[i])).add(strs[i]);
        }
        for(Map.Entry<String, List<String>> e: map.entrySet()){
            res.add(e.getValue());
          }
        System.out.println(res);
        return res;
    }
    public static void main(String args[]){
        
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
        
    }
    
}
