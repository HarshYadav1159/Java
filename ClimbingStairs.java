public class ClimbingStairs {

    public static void main(String args[]){
        int n=4;
        int arr[] = new int[n];

        arr[0] =1;
        arr[1] = 2;
        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.print(arr[n-1]);
    }
    
}
