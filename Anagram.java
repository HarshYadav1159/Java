import java.util.Scanner;

public class Anagram {

     boolean isAnagram(String a, String b) {
        int i,j,c1=0,c2=0,c=0;
        
        char ch1,ch2,ch;
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length()==b.length()){
           for(j=97;j<=122;j++){
               ch=(char)j;
               for(i=0;i<a.length();i++){
                ch1=a.charAt(i);
                ch2=b.charAt(i);
                 if(ch1==ch){
                     c1++;
                 }

                 if(ch2==ch){
                    c2++;
                }
               }
               if(c1!=c2){
                c++;
                return false;
               }
              c1=0;
              c2=0;              
            
            }
              
            if(c==0)
            return true;
            
        
        }

        return false;
    }

    public static void main(String[] args) {
           Anagram obj=new Anagram();
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = obj.isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}