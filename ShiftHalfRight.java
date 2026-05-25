//40. Write a Java program to shift half of the elements to the right side of the array.

import java.util.*;

public class ShiftHalfRight {

    public static void main(String[] args) {

        int arr[] = {2,5,8,9,3,1};

        int mid = arr.length / 2;

        int result[] = new int[arr.length];

        int index = 0;

        for (int i = mid; i < arr.length; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < mid; i++) {
            result[index++] = arr[i];
        }

        System.out.println(Arrays.toString(result)); // [9, 3, 1, 2, 5, 8]
    }
}