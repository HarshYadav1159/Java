import java.util.HashMap;

public class LongestSubArrayDivisiblebyK {
    
    public static void main(String args[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]={2, 7, 6, 1, 4, 5};
        int max=0;
        int sum=0,rem,k=3;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            rem = sum%k;
            if(rem<0)rem = rem+k;

            if(map.containsKey(rem)){
              max = Math.max(max, i-map.get(rem));
            }
            else{
                map.put(rem, i);
            }
        }

        System.out.print(max);
    }
}
