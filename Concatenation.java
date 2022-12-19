import java.util.*;
import java.io.*;
import java.lang.Math;
public class Concatenation {
    static String s ="";
    static double ans =0;

    public static void finalAns(){
         int len;
         double t =0.0;
         len = s.length();
         char ch;
         for(int i = len-1 ; i>=0; i--){
               ch = s.charAt(i);
               if(ch =='0'){
                //  ans = ans + Math.pow(ans, t);
                 t = t+1;
               }
               else{
                ans = ans + Math.pow(2, t);
                 t = t+1;
               }
         }
    }

    public static int concatenate(String n){
        s = s + n;
        return 0;
    }

    static int calcBinary(int n){
        String bin="";
        int rem; 
        while(n!=0){
           rem  = n%2;
            n= n/2;
            if(rem == 0){
                bin ='0' + bin;
            }
            else
            bin = '1' + bin;
        }
        System.out.println(bin);
        concatenate(bin);
        return 0;
    }

    public static int concatenatedBinary(int n){
        int a;
        for(int i =1;i<=n; i++){
            a = calcBinary(i);
        }
        finalAns();

        return (int)((ans)%(Math.pow(10, 9)+7));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

       int b =concatenatedBinary(n);
        
        System.out.println(b);
        
    }
}
