import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Solution{
   static int minimum = 0;
   static int maximum = 0;

     public static void findMin(int a[], int left , int right){
       //one element
        if(left - right==0)
        {
            if(minimum > a[left])
            {
                minimum = a[left]; 

            }
            if(maximum < a[left])
            {
                maximum= a[left]; 

            }
            return;
        }

        //two element
        if(right - left == 1)
        {
           if(a[left] < minimum)
           {
               minimum = a[left];
           }
           if(a[left] > maximum)
           {
               maximum = a[left];
           }
           if(a[right] < minimum)
           {
            minimum = a[right];
           }
           if(a[right] > maximum)
           {
            maximum = a[right];
           }
           return;
        }

       int mid = (left+right)/2;

       findMin(a,0,left);
       findMin(a,mid,right);
    
       return;
    }




    public static void main(String args[]){
        
     Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];

       for(int i =0;i<n;i++){
           a[i]=sc.nextInt();
       }
       minimum = a[0];
      findMin(a,0,n-1);
   System.out.println("Minimum is "+minimum);
   System.out.print("Maximum is "+maximum);
    }
}