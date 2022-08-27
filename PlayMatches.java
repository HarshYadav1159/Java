import java.util.*;
public class PlayMatches {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      int a[]={6,2,5,5,4,5,6,3,7,6};
      int x,y,sum,s1=0;
      int n = sc.nextInt();

      for(int i=1;i<=n;i++)
      {
          x=sc.nextInt();
          y=sc.nextInt();
          sum = x+y;
          while(sum!=0)
          {
            s1=s1+a[(sum%10)];
            sum = sum/10;
          }
        
          System.out.println(s1);
          s1=0;

      }
      
        
    }
}
