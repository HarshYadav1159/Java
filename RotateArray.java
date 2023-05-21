import java.util.HashMap;
import java.util.Map;

public class RotateArray {
    
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7};
        int k=3,newPos;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            newPos = i+k;
            while(newPos > nums.length-1)
            newPos = newPos - nums.length;
            map.put(newPos, nums[i]);
        }

        for(Map.Entry<Integer, Integer> e:map.entrySet()){
           nums[e.getKey()] = e.getValue();
        }
        for(int e: nums){
            System.out.print(e+" ");
        }
    }
}
