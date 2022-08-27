import java.util.*;
public class MedianOfTwoSortedArrays {
    
    //Merge Two Sorted arrays
    static void merge(int a1[],int a2[],int a[]){
        int c1=0,c2=0;
        int l1,l2;
        l1=a1.length;
        l2=a2.length;

        for(int i =0;i<l1+l2;i++){
            if(c1<l1 && c2<l2){
                if(a1[c1] < a2[c2]){
                    a[i]=a1[c1];
                    c1++;
                }

                else{
                    a[i]=a2[c2];
                    c2++;
                }
            }

            else if(c2==l2 && c1<l1){
                a[i]=a1[c1];
                c1++;
            } 

            else if(c1==l1 && c2<l2){
                a[i]=a2[c2];
                c2++;
            }
        }        

        for(int i=0;i<l1+l2;i++){
              System.out.print(a[i]+" ");
        }
       System.out.println();
        calculateMedian(a);
    }
    
    //Calculating Median
    static void calculateMedian(int a[]){
        System.out.print("Median is: ");
        int i;
        if(a.length%2==0){
            i=a.length/2;
            System.out.println((double)(a[i]+a[i-1])/2);
        }
        else{
            i=(a.length/2);
            System.out.println(a[i]);
        }

    }


    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n,m;
       n=sc.nextInt();
       m=sc.nextInt();
       int a1[]=new int[n];
       int a2[]=new int[m];
       int a[]=new int[m+n];

       System.out.println("1st");
       for(int i=0;i<n;i++){
           a1[i]=sc.nextInt();
        }
        System.out.println("2nd");

        for(int i=0;i<m;i++){
           a2[i]=sc.nextInt();
       }

       merge(a1,a2,a);

    }
}
