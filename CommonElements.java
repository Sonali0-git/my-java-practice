//39. Print common elements from two arrays
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        int a[] = {1, 2, 4, 5, 6};
        int b[] = {2, 5, 8, 9, 3, 1};

        System.out.print("Common Elements: ");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}