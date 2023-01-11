import java.util.*;
public class RegularExpression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        String p = new String();
        String p_mod = "";
        s = sc.nextLine();
        p = sc.nextLine();
        int plen;
        int flag =0;
        char ch;
        int len = p.length();

        for(int i= 0; i<len; i++){
           ch = p.charAt(i);

           if(ch== '*' && flag == 0 && p.indexOf('.') == -1){
            System.out.println("true");
            flag=1;
            break;
           }
           else if(ch== '*' ){
             continue;
           }
                        
             else if(ch == '.' &&  p.indexOf('.')!= -1 && flag == 0 ){
                 plen = p_mod.length();           
                    for(int j = 0; j <= s.length() - plen ; j++){
                        // System.out.println(s.substring(j, j+plen));
                         if(p_mod.compareTo(s.substring(j, j+plen)) == 0 && flag == 0 ){
                            System.out.println(true);
                            flag=1;
                            break;
                         }                   
                }
             }

             else{
                p_mod = p_mod + ch;
             }             

             sc.close();
        }

        
        if(flag==0)
        System.out.println("false");
    }
}
