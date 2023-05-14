import java.util.*;

public class SpiralMatrix {    
    public static void main(String args[]){
        int arr[][]={{23,18,20,26,25},{24,22,3,4,4},{15,22,2,24,29},{18,15,23,28,28}};
        
        List<Integer> list=new ArrayList<Integer>();
        int i=0,k=0,j=arr.length-1,l=arr[0].length-1;
        boolean[][] vis = new boolean[j+1][l+1];
        System.out.println(vis[0][0]);
        while(i<=j && k<=l){
         for(int x=k;x<=l;x++){
            if(vis[i][x]==false){
                vis[i][x]=true;
               list.add(arr[i][x]);
            }
         } 
         for(int x=i;x<=j;x++){
            if(vis[x][l]==false){
                vis[x][l]=true;
                list.add(arr[x][l]);
            }
            
         } 
         for(int x=l;x>=k;x--){
            if(vis[j][x]==false){
                vis[j][x]=true;
                list.add(arr[j][x]);
            }
            
         } 
         for(int x=j;x>=i;x--){
            if(vis[x][k]==false){
                vis[x][k]=true;
                list.add(arr[x][k]);
            }
            
         } 
         i++;
         j--;
         k++;
         l--;
        }
        System.out.print(list);

    }
}
