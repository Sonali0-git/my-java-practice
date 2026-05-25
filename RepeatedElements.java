//35. Print repeated elements in array
import java.util.*;

public class RepeatedElements {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 3, 2};

        System.out.print("Repeated Elements: ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}