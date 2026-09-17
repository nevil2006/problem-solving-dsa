public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};

        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("First Largest = " + firstLargest);
        System.out.println("Second Largest = " + secondLargest);
    }
}