public class PhonePad {
    
    static void pad(String s, String u){
        if(u.isEmpty()){
            System.out.println(s);
            return;
        }
          int digit = u.charAt(0) - '0';
        for(int i = (digit-1)*3; i<digit*3;i++ ){
            char ch = (char)('a' + i);
            pad(s+ch,u.substring(1) );
        }
    }
    public static void main(String[] args){
          pad("","12");
    }
    
}
