public class PrintLCS {

    public static void main(String args[]){
        int dp[][] = new int[6][7];
        String a ="acbcf";
        String b = "abcdaf";

        for(int i=0; i<6; i++){
            for(int j=0; j<7; j++){
                if(i==0||j==0){
                   dp[i][j]=0;
                }
            }
        }

        for(int i=1; i<6; i++){
            for(int j=1; j<7; j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int x=5,y=6;
        String s="";
        while(x>0 && y>0){
            if(a.charAt(x-1) == b.charAt(y-1)){
                s =a.charAt(x-1)+ s;
                x--;
                y--;
            }
            else{
                if(dp[x-1][y] > dp[x][y-1]){
                    x--;
                }
                else 
                y--;
            }
        }
        // for(int i= 0;i<5;i++){
        //     for(int j=0;j<6;j++){
        //         if(a.charAt(i) ==b.charAt(j) && s.indexOf(a.charAt(i))==-1){
        //             s = s+a.charAt(i);
        //         }
        //     }
        // }

        



        for(int i=0; i<6; i++){
            for(int j=0; j<7; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(s);
    }
}
