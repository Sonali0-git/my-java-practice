// 12. Print Zeros Present in an Array

import java.util.*;

public class PrintZerosInArray {

    public static void main(String[] args) {

        int arr[] = {4,8,0,6,0,6};

        System.out.print("Output{");

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("}");
    }
}