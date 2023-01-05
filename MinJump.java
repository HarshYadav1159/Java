
public class MinJump{
    public int jump(int[] A) {
            // count(A, 0, 0); 
            int jumps = 0;
            int f = 0;
            int c =0 ;
            for(int i=0; i < A.length-1 ;i++){
                f = Math.max(f, A[i] + i);
                if(i==c){
                    c = f;
                    jumps++;
                }
            } 
        return jumps;
    }

    public static void main(String[] args){
        MinJump obj = new MinJump();
        int a[]={1,1,1,1};
        System.out.println(obj.jump(a));
    }
}
