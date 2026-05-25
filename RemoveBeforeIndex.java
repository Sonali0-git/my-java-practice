// Write a Java program to remove the elements present before the given index number.

import java.util.*;

public class RemoveBeforeIndex {

    public static void main(String[] args) {

        int a[] = {1,2,4,5,1,3,2};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < a.length) {

            for (int i = index; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }

        } else {
            System.out.println("Invalid Index");
        }
    }
}