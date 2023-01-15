import java.util.*;
public class HashS {
    
   
    public static void main(String args[]){
         HashSet<Integer> set = new HashSet<>();

         set.add(1);
         set.add(2);
         set.add(3);

         Iterator it = set.iterator();

         while(it.hasNext()){
            System.out.print(it.next() + " ");
         }
    }
}
