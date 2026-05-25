// 14. Insert Even Values in an Array

import java.util.*;

public class InsertEvenValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter even numbers:");

        for(int i=0; i<arr.length; i++) {

            arr[i] = sc.nextInt();

            if(arr[i] % 2 != 0) {

                System.out.println("Only even numbers allowed");
                i--;
            }
        }

        System.out.println("Array Elements:");

        for(int i=0; i<arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}