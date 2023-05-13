import java.util.ArrayList;

public class SetMatrixZeroes {

    public static void main(String args[]){
        ArrayList<Integer> row =new ArrayList<>();
        ArrayList<Integer> col =new ArrayList<>();
        int arr[][]={{1,2,3},
                     {0,0,6}
                     };
        int lenrow = arr.length;
        int lencol = arr[0].length;
        
       for(int i=0;i<lenrow;i++){
        for(int j=0;j<lencol;j++){
            if(arr[i][j]==0){
              if(!row.contains(i))
              row.add(i);
              if(!col.contains(j))
              col.add(j);
            }
        }
       }
       for(int i=0; i<row.size(); i++){
        int val = row.get(i);
         for(int j=0; j< lencol;j++){
           arr[val][j]=0;
         }
       }

       for(int i=0; i<col.size(); i++){
        int val = col.get(i);
         for(int j=0; j< lenrow;j++){
           arr[j][val]=0;
         }
       }
       for(int i=0;i<lenrow;i++){
        for(int j=0;j<lencol;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}
