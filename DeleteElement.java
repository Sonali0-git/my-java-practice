//37. Delete indexed element from array
import java.util.*;

public class DeleteElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int deleteIndex = 1;

        int newArr[] = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i == deleteIndex) {
                continue;
            }

            newArr[j++] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}