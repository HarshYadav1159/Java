import java.util.Scanner;

public class Substring{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String s1 = "";
        
       int i; 
       int l = s.length();
       for(i=0;i<=l-k;i++){
           s1=s.substring(i,k+i);          
               
          
           if(smallest.compareTo(s1)>0)
           smallest=s1;
           
           if(largest.compareTo(s1)<0)
           largest=s1;
           
           s1="";
               
          
           
       }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}