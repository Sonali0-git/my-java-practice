//55.SortMethod
import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {

        int a[] = {9,5,6,1,2,7};

        Arrays.sort(a);

        System.out.print("Sorted Array: ");

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}