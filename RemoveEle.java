public class RemoveEle {
    
    public static void main(String args[]){
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2,i=0,j=nums.length-1,temp;

        while(i<=j){
            while(nums[j]==val)
            j--;

            if(nums[i] == val){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else{
                i++;
            }
        }

        for(int ele: nums)
        System.out.print(ele+" ");
        System.out.print("\n" + i);
    }
}
