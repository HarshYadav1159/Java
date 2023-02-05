
public class MaxAbsDiff {
    public static int maxArr(int[] A) {
        
        int max1 =(int) (-1*Math.pow(2, 30));
        int max2 =(int) (-1*Math.pow(2, 30));
        int min1 =(int) (Math.pow(2, 30)-1);
        int min2=(int) (Math.pow(2, 30)-1);

        for(int i=0 ; i< A.length; i++){
            max1 = Math.max(max1, A[i]+i);
            min2=Math.min(min2, -A[i]+i);
            max2 = Math.max(max2, -A[i]+i);
            min1= Math.min(min1, A[i]+i);
        }
          int max = Math.max(max1-min1, max2-min2);
        
        return max;
    }
    public static void main(String args[]){
        int a[] = {30, 74, 15, 49, 88, 77, 46, 48, 36, 62};
        int ma =0, f;
        // for(int i=0; i<a.length; i++){
        //    for(int j=i+1; j<a.length; j++){
        //     f = Math.abs(a[i]-a[j]) + Math.abs(i-j);
        //     if(f > ma){
        //         ma = f;
        //     }
        //    }
        // }
        int m =maxArr(a);
        System.out.print(m);

    }
    
}
