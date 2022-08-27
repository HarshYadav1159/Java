import java.util.*;
public class LongestPalindromicSubstring{


    static boolean isPalindrome(String s){
        char ch;
        String s1=new String();
        
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            s1=ch+s1;
        }
         
        if(s1.compareToIgnoreCase(s)==0){
             return true;
        }

        return false;
    }

    public static void main(String args[]){
        int max=0,k=0;
    Scanner sc = new Scanner(System.in);
    String str = new String();
    String s = new String();
    str = sc.nextLine();
    String string[]=new String[4*str.length()];
    int l[]=new int[4*str.length()];
    int t=0;
    char ch;
    int len=str.length();

    for(int i=len;i>0;i--){
        for(int j=0;j<i;j++){
           ch=str.charAt(j);
           s=s+ch;

           if(isPalindrome(s)){
            string[t]=s;
            l[t]=s.length();
            t++;
         }
        }
        // System.out.println(s);      
        s="";
    }

     for(int i=0;i<len;i++){
         for(int j=i;j<len;j++){
            ch=str.charAt(j);
            s=s+ch;

            if(isPalindrome(s)){
                string[t]=s;
                l[t]=s.length();
                t++;
             }
         }
        //  System.out.println(s);         
         s="";
     }
     
         
     for(int i=0;i<t;i++){
         if(string[i]!=null){
            if(l[i]>max){
                max=l[i];
                k=i;
            }
         }
     }

     System.out.println(k);
     System.out.println(string[k]);
     System.out.println(l[k]);
    }
   
}