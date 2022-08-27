import java.io.*;
import java.util.*;

public class PalindromeString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String s1=new String();
        int l = A.length();
        int i;
        
        for(i=l-1;i>=0;i--){
            s1=s1+A.charAt(i);
        }
        if(A.compareTo(s1)==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
