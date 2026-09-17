public class postive{
    public static void main(String[] args) {
        int[]arr={10, -5, 7, -3, -8, 2, 0};
        int positive=0;
        int negative=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            }
            else if (arr[i]<0){
                negative++;
            }
        }
        System.out.println("positive="+positive);
        System.out.println("negative="+negative);

    }
}