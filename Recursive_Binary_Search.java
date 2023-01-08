public class Recursive_Binary_Search
{
  static int prodt=1;
  static int rev=0;
    static int Binary_Search(int start, int end, int[] A, int t){
       
       int mid = (start + end)/2;
       
       if(start > end){
      //  System.out.print("Not Found");
       return -1;
       }

       if( A[mid]==t){
        System.out.print(mid+1);
       }

       if(A[mid] < t){
         return Binary_Search(mid+1, end, A, t);
       }

       if(A[mid] > t){
        return Binary_Search(start, mid, A, t);
       }
       
       return 0;
    
    }

    static void Print(int n){
      if(n<1)
      return;

      else{        
      Print(n-1);
      System.out.print(" "+n);
      }
      
    }

    static int product(int n){

      if(n==0){
        return 1;
      }       
    
      return n%10 * product(n/10);
    }

    static void rev_Number(int n){

      if(n==0){
        return;
      }

      int dig;
      dig = n%10;
      rev = rev*10 + dig;
      rev_Number(n/10);
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        Binary_Search(0, a.length - 1, a, 1);
        // Print(5);
      //  int d= product(123456);
        // System.out.print(c);     
      

    }
}