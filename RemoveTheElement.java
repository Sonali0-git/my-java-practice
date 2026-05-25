//44.
import java.util.*;

public class RemoveTheElement {
    public static void main(String[] args) {

        // Test Case 1
        int a[] = {1,2,4,5,1,3,2};
        int index1 = 3;

        System.out.print("Output-1: ");
        for(int i = index1 + 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // Test Case 2
        int index2 = 5;

        System.out.print("Output-2: ");
        for(int i = index2 + 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}