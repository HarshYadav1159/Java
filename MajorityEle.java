import java.util.*;

public class MajorityEle {

    public static void main(String arg[]){
        int nums[]={3,2,3};
        HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0; i<nums.length; i++){
         if(!map.containsKey(nums[i]))
         map.put(nums[i], 1);
         else
         map.put(nums[i], map.get(nums[i])+1);
     }   

     int max=0,val=0;
     for(Map.Entry<Integer, Integer> e: map.entrySet()){
         if(e.getValue()>max){
          max = e.getValue();
          val = e.getKey();
         }         
     }
     System.out.print(val);
    }    
}
