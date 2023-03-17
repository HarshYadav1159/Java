public class MaxDiffZandO {
    
    static int maxSub(String S){
        if(S.indexOf('0') == -1)
        return -1;
    int arr[] = new int[S.length()];
    for(int i=0; i<arr.length;i++){
        if(S.charAt(i) == '1')
            arr[i] =-1;
        
        else
        arr[i] =1;        
    }

     
    int sum = 0;
    int max =0;
    for(int i =0;i<S.length(); i++){
       if(sum + arr[i] >= 0)
       sum = sum + arr[i];

       if(sum>max){
        max = sum;
       }
    }
     
       return max;
    } 
    public static void main(String args[]){
        System.out.println(maxSub("1010"));
    }
    
}
