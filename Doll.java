import java.util.*;
public class Doll {

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     int n,k,t,c=0;

     t = sc.nextInt();
     
     for(int i=1;i<=t;i++)
     {
         n=sc.nextInt();
         k=sc.nextInt();
         int a[]= new int[n];

         for(int j =0;j<n;j++)
         {
            a[j]=sc.nextInt();

            if(a[j]>k)
            c++;
         }      
         System.out.println(c);   
         c=0;
     }


 }

}
