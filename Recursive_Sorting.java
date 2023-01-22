public class Recursive_Sorting {
    static int a[]= new int[5];

    static boolean Sort(int[] A, int j){
        int t;
        if(j==4)
        return true;

       if(A[j] < A[j+1] && Sort(A, j+1)){
          return true;
       }
      else{
        t = A[j];
        A[j] = A[j+1];
        A[j+1] = t;
      }       
      a=A;

      return A[j] < A[j+1] && Sort(A, j+1);      
    }
    
    public static void main(String args[]){
        a[0]=5;
        a[1]=1;
        a[2]=9;
        a[3] = 7;
        a[4] = 0;

         
            for(int i = 0; i<5;i++){
                Sort(a,0);
                
            }       
            for(int i = 0; i<5;i++)
            System.out.print(a[i]);
    }
}
