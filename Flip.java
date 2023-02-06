import java.util.ArrayList;

public class Flip {

    public static int[] flip(String A) {
        int l = A.length();
         int emp[] = new int[0];
         int ans[] = new int[2];
         int left=0, right=0;
         int currSum=0,max=0;
         for(int i=0; i<l; i++){
             if(A.charAt(i) == '1'){
                 currSum = currSum-1;
             }
             if(A.charAt(i) == '0')
             currSum = currSum + 1;
             
             if(currSum > max){
                 max = currSum;
                 right=i;
                 ans[0] = left+1;
                 ans[1] =right+1;
             }
             if(currSum < 0){
                currSum = 0;
                left =i+1;
             }
             
         }
         
         if(max == 0)
         return emp;
         
         
         return ans;
    }

    public static void main(String args[]){
          int a[]={};
          String s = "0011101";
          
          a=flip(s);
          for(int i=0; i<a.length; i++)
          System.out.print(a[i]+" ");
    }
    
}
