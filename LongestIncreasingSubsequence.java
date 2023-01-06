public class LongestIncreasingSubsequence {
      
    public static void main(String[] args){
        
        int max = 0;
       int a[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
       int[] b = new int[a.length];
       for(int i =0; i<a.length; i++){
          b[i] =1;
       }
       for(int i =1 ; i< a.length; i++){
        for(int j = 0; j<i; j++){
          if(a[j] < a[i] && b[i]<=b[j]){
            b[i] = 1+b[j];
          }
        }
       }
       for(int i =0; i<a.length; i++){
        if(b[i] > max)
        max = b[i];
       }
    
       System.out.println(max);
    
    }
}
