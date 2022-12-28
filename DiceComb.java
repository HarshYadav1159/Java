import java.util.*;
public class DiceComb {

    static ArrayList<Integer> comb(int p, int up){
      ArrayList<Integer> list = new ArrayList<>();
      if(up == 0){
        list.add(p);
        return list;
      }
       
      for(int i =1; i<=up;i++){       
        list.addAll(comb(p*10+i , up - i));
      }

      return list;
    }

    public static void main(String[] args){
          
        System.out.print(comb(0, 4));
    }
    
}
