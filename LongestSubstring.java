import java.util.*;
public class LongestSubstring {
    
    public static void main(String args[]){
        int max=0;
        
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a String: ");
      String str = new String();
      String s1 = new String();
      str = sc.nextLine();
      System.out.println();
       char ch;
      String s[]= new String[100];
      int l[]=new int[100];
      int len = str.length();
          int t=0;
      for(int i=0;i<len;i++){
           for(int j=i;j<len;j++){
               ch=str.charAt(j);
               if(s1.indexOf(ch)<0){
                   s1=s1+ch;
               }
               else{
                  s[t]=s1;
                  l[t]=s1.length();
                  s1="";
                  t++;
                  break;
               }
           }
      }
      if(str.length()!=0){
        s[t]=s1;
        l[t]=s1.length();
      }
     
      int k=0;
      for(int i=0;i<l.length;i++){
          if(s[i]!=null){
              if(l[i]>max){
                max=l[i];
                k=i;
              }
            }            
      }

      System.out.println(k);
      System.out.println(s[k]);
      System.out.println(l[k]);
        }
}
