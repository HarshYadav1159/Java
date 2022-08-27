class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int j,y;
        double sum=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(j=0;j<n;j++){
                for(y=0;y<=j;y++)
                sum = (Math.pow((double)2,(double)y)*b) + sum;
                System.out.print((a + (int)sum)+" ");
                sum=0;
            }
            System.out.println();
            
        }
        
        
        in.close();
    }
}