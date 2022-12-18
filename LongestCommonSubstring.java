import java.util.ArrayList;

public class LongestCommonSubstring {
    static ArrayList<String> list = new ArrayList<>();
    static String s ="";
    static int c =0;
    static void commonSubstring(String x, String y, int n, int m,String a){
        if(n==0 || m==0){
            if(a!="" && !list.contains(a))
            list.add(a);
            return ;
        }
        
        if(x.charAt(n-1) != y.charAt(m-1) && a!=""){
            list.add(a);
        }
       

        if(x.charAt(n-1) == y.charAt(m-1)){
           commonSubstring(x.substring(0, n-1), y.substring(0,m-1), n-1, m-1, x.charAt(n-1) + a);          
        }

        else{            
            commonSubstring(x.substring(0, n), y.substring(0,m-1), n, m-1, "");
            commonSubstring(x.substring(0, n-1), y.substring(0,m), n-1, m, "");            
        }

       
    }
    
    
    public static void main(String[] args){
    String s1 ="abcd";
    String s2 = "abc";
    int dp[][] = new int[s1.length()+1][s2.length()+1];
    // commonSubstring(s1, s2, s1.length(), s2.length(), "");
    // System.out.println(list);

    for(int i =0; i<s1.length()+1;i++){
        for(int j=0;j<s2.length()+1;j++){
            if(i==0||j==0)
            dp[i][j] = 0;
        }
    }

    for(int i =1; i<s1.length()+1;i++){
        for(int j=1;j<s2.length()+1;j++){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                dp[i][j] = 1 + dp[i-1][j-1];
            }

            else{
                dp[i][j] = 0 ;
            }
        }
    }

    for(int i =0; i<s1.length()+1;i++){
        for(int j=0;j<s2.length()+1;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    }
}
