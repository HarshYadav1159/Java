import java.util.HashMap;

public class RomToInt {
  
    public static void main(String args[]){
      HashMap<String, Integer> map= new HashMap<>();
      map.put("I",1);
      map.put("V",5);
      map.put("X",10);
      map.put("L",50);
      map.put("C",100);
      map.put("D",500);
      map.put("M",1000);
      String s = "MCMXCIV";
      int len = s.length();
      int num=0;

      for(int i =len-1; i>=0; i--){
        if(i==(len-1)){
           num = num + map.get(""+s.charAt(i));
        }
        else if(map.get(""+s.charAt(i))<map.get(""+s.charAt(i+1))){
            num = num - map.get(""+s.charAt(i));
        }
        else if(map.get(""+s.charAt(i))>=map.get(""+s.charAt(i+1))){
          num = num + map.get(""+s.charAt(i));
        }
        
      }
      System.out.print(num);

    }
    
}
