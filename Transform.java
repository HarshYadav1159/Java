public class Transform {

    public static void main(String args[]){
        String A="GeeksForGeeks";
        String B="ForGeeksGeeks";

        int p1=A.length()-1;
        int p2 = B.length()-1;
        int count =0;
        while(p1>=0){
            if(A.charAt(p1) == B.charAt(p2)){
                p1--;
                p2--;
            }
            else{
                p1--;
                count++;
            }
        }
        System.out.println(count);
    }
    
}
