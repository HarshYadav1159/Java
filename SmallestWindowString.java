import java.util.*;

public class SmallestWindowString {
   

    public static void main(String args[]){
        String s = "bdheedcfeeafhijabdbehhfaigjghiijabcfagjgcedbjhhehajgbgbiechagdfeaffejdhhihdhjjahbcgcgdfbfdadhdgefghchdhdigbjciehiebgahbahddhiidebcfaieefjgefaafhbfiabgdbjcfbaedgfhigbgibegjfjjgicjcgciccfdhehcgjdeccbfehdgcddighgagfbeheaccahgfggdbgeaiajeahegbcjadehajafjfcdbbjfgahhcjbaigfbfiifdegiafeejibcfbdecfeicbjgabhbhfdgebfjjjjbggfgcibhehchhffhcebcbdbcedbadjehffjihhdichhebajjgbehjacbbidagihdijjecfcjeibfadbdaehcfjfbjhgbdgbhdjggiajfgjfdifafgebdbjghbehceaiedabebhgigagehcfegjeaiehbfgedaddegiaahgacigafihahegefjgjhhijjfgbddhiafhbjiicjaaigeeeiiadj";
        String s2 = "cdaehaihiejehfcfajjcidcdhghfjejbgibadbbgbjegfhgggfgaefaaabcbgdiffdejdijebfebejhaccffehff";
        String res="";
        int i=0,j=0,min=(int) Math.pow(2,31);
        HashMap<Character, Integer> map=new HashMap<>();
        for(int x=0;x<s2.length();x++){
             if(!map.containsKey(s2.charAt(x))){
                map.put(s2.charAt(x), 1);
             }
             else{
                map.put(s2.charAt(x), map.get(s2.charAt(x))+1);
             }
        }
        int count= map.values().stream().mapToInt(Integer::intValue).sum();

        while(j<s.length()){
            
              if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                
                if(map.get(s.charAt(j)) >= 0)
                count--;
              }
             
              if(count==0){
                while(count == 0){
                    if((j-i) < min && count ==0){
                        min=j-i;                   
                        res = s.substring(i, j+1);                    
                      }
    
                  if(map.containsKey(s.charAt(i))){
                     map.put(s.charAt(i), map.get(s.charAt(i))+1);
                     if(map.get(s.charAt(i)) > 0)
                     count++;
                  }            
                 
                  i++;
                }
              }

           j++;
        }
        if(res.length()!=0)
        System.out.println(res);
        else
        System.out.println("-1");
        
    }
    
}
