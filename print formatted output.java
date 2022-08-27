import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int c=0,dig,n,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                n=x;
                while(n>0){
                    dig= n%10;
                    n=n/10;
                    c++;
                    
                }
               
                    System.out.print(s1);
                for(j=s1.length()+1;j<=18;j++){
                    if(j==16&&x==0)
                    System.out.print("0");
                    else if(j==17&&x==0)
                    System.out.print("0");
                    else if(j==18&&x==0)
                    System.out.print("0");
                    if(j==16&&c==1)
                    System.out.print("0");
                    else if(j==17&&c==1)
                    System.out.print("0");
                    else if(j==18&&c==1)
                    System.out.print(x);
                    else if(j==16&&c==2)
                    System.out.print("0");
                    else if(j==17&&c==2)
                    System.out.print(x);
                    else if(j==16&&c==3)
                    System.out.print(x);
                    else if(j<16)
                    System.out.print(" ");
                }
                System.out.println();
                c=0;
            }
            System.out.println("================================");

    }
}
