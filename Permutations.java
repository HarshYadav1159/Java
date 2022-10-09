import java.util.ArrayList;

public class Permutations {
    static ArrayList<String> list = new ArrayList<>();
    static void permut(String s1, String s2){
       
        if(s2.isEmpty()){
            if(!list.contains(s1))
            list.add(s1);
            return ;
        }

        char ch = s2.charAt(0);
        
        for(int i = 0; i<= s1.length(); i++){
            String f = s1.substring(0, i);
             String s = s1.substring(i, s1.length());
          permut(f + ch + s, s2.substring(1));
        }
    }

    public static void main(String args[]){
         String s = "aaa";
        permut("", s);
         System.out.println(list.size());
    }
}
