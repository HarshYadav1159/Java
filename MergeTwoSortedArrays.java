public class MergeTwoSortedArrays {
    public static void main(String args[]){
        int m=0,n=1,i=0,j=0,t=0;
         int nums1[] = {0};
         int nums2[] = {1};
         int arr[] = new int[m+n];
         
         while(i<m || j<n){
            if(i<m && j<n){
                if(nums1[i]<=nums2[j]){
                    arr[t] = nums1[i];
                    i++;
                    t++;
                }
                else{
                    arr[t] = nums2[j];
                    j++;
                    t++;
                }
            }           

            else if(i<m && j>=n){
                arr[t] = nums1[i];
                i++;
                t++;
            }

            else if(i>=m && j<n){
                arr[t] = nums2[j];
                j++;
                t++;
            }
         }

         nums1 = arr;
         for(int ele: nums1){
          System.out.print(ele+" ");
         }

    }
    
}
