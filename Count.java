public class Count {

    public static void main(String[] args) {

        int even = 0;
        int odd = 0;

        int[] arr = {2, 3, 5, 6, 7, 8, 10};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}