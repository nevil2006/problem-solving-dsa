import java.util.*;

public class search {
    public static void main(String[] args) {

        int[] arr = {10, 60, 30, 40, 50};

        int target = 60;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}