//30. Sum of even digits of each element
import java.util.*;

public class SumEvenDigits {
    public static int evenDigitSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {231, 554, 572, 962, 24, 1};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = evenDigitSum(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}