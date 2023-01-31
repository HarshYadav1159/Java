import java.util.ArrayList;

public class PlusOne {
    public static int[] plusOne(int[] A) {
        int len = A.length;
        ArrayList<Integer> B = new ArrayList<>();
        int car=0;
        int t=0;
        for(int i=len-1; i>=0; i--){
            if(i==0 && len==1){
                A[i] = A[i] + 1;
            }
            else if(i==0 &&len>1){
                A[i] = A[i]+car;
            }
           else if(i == len-1){
               if(A[i]+1 > 9){
                   car =1;
                   A[i] = (A[i]+1)%10;
               }  
               else{
                car =0;
                A[i] = (A[i]+1);
            }               
           }
           else if(A[i] + car < 10){
                   A[i] = A[i] + car;
                   car =0;
               }
               
            else if(A[i] + car>9){
                A[i] =(A[i] + car)%10;
                car =1;
            }
        }

        if(A[0]>9){
            for(int i = 0; i<A.length; i++){
                if(i==0){
                   B.add(t, 1);;
                   t++;
                   B.add(t, A[i]%10);
                   t++;
                }
                else{
                    B.add(t,A[i]);
                    t++;
                }
                
            }

            int[] arr = B.stream().mapToInt(i -> i).toArray();
            return arr;
        }
        else if(A[0] == 0){
            int flag =0;
            for(int i = 0; i<A.length; i++){
                if(A[i] == 0 && flag ==0){
                    continue;
                }
                else{
                    flag =1;
                }
                if(flag ==1){
                    B.add(A[i]);
                }
            }
            int[] arr = B.stream().mapToInt(i -> i).toArray();
            return arr;
        }
        return A;
    }

    public static void main(String args[]){
          int a[] = {9};
          int b[] = {};
          b=plusOne(a);
          for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
          }
    }
    
}
