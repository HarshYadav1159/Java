import java.util.Arrays;
import java.util.Collections;

public class Hindex {

    public static void main(String args[]){
    Integer[] arr = {1};
    Arrays.sort(arr, Collections.reverseOrder());
    int maxh = 0;
    for(int h=1; h<=arr.length; h++){

        int l=0,u=arr.length-1;

        while(l<=u){
            int mid = (l+u)/2;
            if(arr[mid]-h >= 0){
                if(h<=mid+1 && maxh < h){ 
                   maxh = h;
                }
                l=mid+1;
            }
            else{
              u = mid-1;
            }
        }
    }

    System.out.print(maxh);
    }
}
