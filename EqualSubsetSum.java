import java.util.*;
public class EqualSubsetSum {
    
    static int Sum(ArrayList<Integer> l){
        int sum =0;
      for(int i = 0; i<l.size();i++){
        sum = sum+ l.get(i);
      }
      return sum;
    }


    static ArrayList<Integer> subsets(ArrayList<Integer> l1, ArrayList<Integer> l2, int n){
        ArrayList<Integer> ans =new ArrayList<>();
        if(n==0||l1.isEmpty()){            
            return ans;
        }

        for(int i = 0; i<n;i++){
            if(l1.size()!=0){
                l2.add(l1.get(i));
                l1.remove(i); 
            }
            
            if(Sum(l1) == Sum(l2)){
                System.out.println(l1+" "+l2);
            }
           ans.addAll(subsets(l1, l2, n-1));
        }

        return ans;
        
    }

    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Integer> l =new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(11);
        // System.out.println(l);
        subsets(list,l, list.size());
    }
    
}
