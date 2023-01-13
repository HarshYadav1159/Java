
import java.util.*;
public class RemDups {

    public static void main(String args[]){
        LinkedList<Integer> lis = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        lis.add(1);
        lis.add(4);
        lis.add(3);
        lis.add(4);
        lis.add(2);

        // for(Integer e: lis){
        //     System.out.print(e + " ");
        // }

        for(int i =0; i<lis.size()-1;i++){
           for(int j = i+1; j<lis.size(); j++){
                if(lis.get(i) == lis.get(j)){
                    set.add(lis.get(i));
                }
           }            
        }

        // for(int i = 0; i<lis.size(); i++){
        //     if(set.contains(lis.get(i))){
        //         lis.removeAll(set);
        //     }
        // }
        lis.removeAll(set);

        Iterator it = lis.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        } 
    }
    
}
