import java.util.ArrayList;

public class PrintDiagonally {
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}
                     };
        int N=3;
        ArrayList<Integer> list=new ArrayList<>();
        for(int k=0; k<= 2*(N-1); k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(k==i+j)
                    {
                     list.add(arr[i][j]);
                     break;
                    }
                    }
                }
            }
        System.out.print(list);
        }
    }
