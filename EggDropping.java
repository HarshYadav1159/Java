public class EggDropping {
    static int solve(int e, int f){
        if(f==0||f==1)
        return f;

        if(e==1)
        return f;
        int min = (int)(Math.pow(2,31));
        for(int k=1;k<=f;k++){
            int temp = 1+ Math.max(solve(e-1,k-1), solve(e,f-k));
            min = Math.min(min, temp);
        }
      return min;
    }
    public static void main(String args[]){
     int e = 1, f=2;
     System.out.println(solve(e, f));
    }
}
