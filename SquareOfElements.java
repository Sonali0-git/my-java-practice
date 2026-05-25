// 19. Print Square of Each Element in an Array

import java.util.*;

public class SquareOfElements {

    public static void main(String[] args) {

        int arr[] = {2,3,4,5};

        System.out.print("Output{");

        for(int i=0; i<arr.length; i++) {

            System.out.print((arr[i] * arr[i]) + " ");
        }

        System.out.print("}");
    }
}