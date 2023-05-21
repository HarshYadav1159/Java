public class RemEleOccuringAtMostTwice {

    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};
        int curr=2,prev=1;
        while(curr<nums.length){
            if(nums[curr] == nums[prev] && nums[curr] == nums[prev-1]){
                curr++;
            }
            else{
                prev++;
                nums[prev] = nums[curr];
                curr++;
            }
        }
        // for(int ele: nums)
        // System.out.print(ele+" ");
        System.out.print(prev+1);
    }    
}
