// 15. Find Last Index Value of an Element

import java.util.*;

public class LastIndexValue {

    public static void main(String[] args) {

        int arr[] = {1,2,3,9,3,4,9,6,7,8};

        int index = -1;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 9) {
                index = i;
            }
        }

        System.out.println("Output{" + index + "}");
    }
}