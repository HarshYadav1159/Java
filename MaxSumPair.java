import java.util.Arrays;
import java.util.Collections;

public class MaxSumPair {

    public static void main(String args[]){
       Integer arr[] = {5,10,15,300};
       Arrays.sort(arr, Collections.reverseOrder());
       int i =0,j=1,sum=0,n=12;
       while(i<arr.length &&j<arr.length){
         if(arr[i] - arr[j] < n){
            sum = sum + arr[i]+ arr[j];
            i=j+1;
            j=i+1;
         }
         else{
            i++;
            j=i+1;
         }
       }
       System.out.print(sum);
    }
    
}
