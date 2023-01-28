public class ComBin {   
    static int cont(int n ,int m ){
       if(n==0 && m==0){
        return 1;
       }

      if(n!=0 && m==0){
        return 0 + cont(n-1, m);
       }

       else if(n==0 && m!=0){
        return 0 + cont(n, m-1);
       }

       return 0 + cont(n-1,m) + cont(n,m-1);

    }
    public static void main(String args[]){
        int n =2;
        int m=3,c=0;
        if(m!=0)
         c =cont(n,m-1);
        System.out.print(c);

    }
    
}
