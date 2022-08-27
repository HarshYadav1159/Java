import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l =s.length();
        int i,c=0,t=0;
        String[] str= new String[l+1];
        String s1=new String();
         char ch;
        for(i=0;i<l;i++){
           ch=s.charAt(i);
           if(ch=='?'||ch==' '||ch=='\''||ch==','||ch=='_'||ch=='@'||ch=='.'||ch=='!'){
               if(s1!=""){
                c++;
                str[i]=s1;
               }
                
               s1="";
            }
           else{
               s1=s1+ch;
           }
           t++;

        }
        str[t]=s1;

        System.out.println(c);
        for(i=0;i<str.length;i++){
            if(str[i]!=null)
            System.out.println(str[i]);
        }
        
        sc.close();
    }
}

