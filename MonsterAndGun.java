import java.util.Arrays;

public class MonsterAndGun {

    public static void main(String args[]){
        int[] arr={16 ,19 ,7 ,11 ,23 ,8 ,16};
        int hit=8,t=6;
        int p=0,kills=0;
        Arrays.sort(arr);

        while(t>0 ){
            arr[p] = arr[p] - hit;
            if(arr[p] <= 0){
                p++;
                kills++;
            }
            t--;
        }
        System.out.println(kills);
    }
}
