import java.util.*;
public class Hashing {
    public static void main(String args[]){
      HashMap<String, Integer> map = new HashMap<>();


      //Insertion
      map.put("India", 120);
      map.put("USA", 30);
      map.put("China", 150);

      System.out.println(map);

      //Search
      if(map.containsKey("China")){
        System.out.println("key found");
      }
      else{
        System.out.println("key not found");
      }

      //Getting key
      System.out.println(map.get("India"));
      System.out.println(map.get("Pakistan"));

      //Iterations
      for(Map.Entry<String, Integer> e: map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
      }
      
      //Iteration using keys
      Set<String> keys = map.keySet();
      for(String key : keys){
        System.out.println(key+" "+ map.get(key));
      }

      //Remove
      map.remove("China");
    } 
}
