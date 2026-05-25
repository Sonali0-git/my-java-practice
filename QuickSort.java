//53.QuickSort
import java.util.*;

public class QuickSort {

    static void quickSort(int a[], int low, int high) {

        if(low < high) {

            int pivot = partition(a, low, high);

            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }

    static int partition(int a[], int low, int high) {

        int pivot = a[high];
        int i = low - 1;

        for(int j=low; j<high; j++) {

            if(a[j] < pivot) {

                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int a[] = {10,7,8,9,1,5};

        quickSort(a, 0, a.length - 1);

        System.out.print("Sorted Array: ");

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
