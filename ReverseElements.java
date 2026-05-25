//28
import java.util.*;

public class ReverseElements {
    public static int reverseNum(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int arr[] = {23, 55, 57, 93, 1};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseNum(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}