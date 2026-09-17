import java.util.*;   
public class countfreq {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,2,3,2,2,2,2};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}
