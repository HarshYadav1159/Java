import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    
    public static void main(String args[]){
      List<List<Integer>> ans=new LinkedList<>();
      int nums[]={-1,0,1,2,-1,4};
      int len = nums.length;
      Arrays.sort(nums);
      int i;     
        
      for(i=0;i<len-2; i++){
        if(i==0 || (i>0 && nums[i] != nums[i-1])){
            int l=i+1;
            int h =len-1;
            int sum = 0 - nums[i];

            while(l<h){
                if(nums[l]+nums[h] == sum){
                    ans.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    while(l<h && nums[l] == nums[l+1]) l++;
                    while(l<h && nums[h] == nums[h-1]) h--;
                    l++;
                    h--;
                }
                else if(nums[l]+nums[h]>sum){
                    h--;
                }
                else{
                    l++;
                }
            }

        }
      }
      System.out.print(ans);
      
    }
    
}
