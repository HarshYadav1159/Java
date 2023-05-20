import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemDuplicate {
    public static void main(String args[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int nums[]={-3,-1,0,0,0,3,3};
        int t=0;
        for(int i=0; i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],t);
                t++;
            }
        }
        System.out.println(map.size());
        int i=0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
        nums[i] = e.getKey();
        i++;
        }
        Arrays.sort(nums, 0, map.size());
        for(int ele:nums)
        System.out.print(ele + " ");
    }
}
