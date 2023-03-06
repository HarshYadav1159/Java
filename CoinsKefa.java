
import java.util.*;
public class CoinsKefa {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int a[] = new int[n];
        int p[] = new int[m];
        
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
         for(int i =0;i<m;i++){
            p[i] = sc.nextInt();
        }
        
        int x=0,k=0,start=0;
        
        for(int i=0; i<m; i++){  
            if(start>=n){
                System.out.println(-1+" "+-1);
            }
            else{
                while(k<p[i] && start < n){
                k = k + a[start];
                start++;
                x++;
                
            }
            System.out.println(x+" "+k);
            x=0;
            k=0;
            }
            
            
        }
        
    }
    
}
