// 7. Java program to print even index sum and odd index sum
// Input: {1,2,3,4,5,6}
// Output: Even index sum = 9, Odd index sum = 12

public class EvenOddIndexSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int evenIndexSum = 0;
        int oddIndexSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                evenIndexSum = evenIndexSum + arr[i];
            } else {
                oddIndexSum = oddIndexSum + arr[i];
            }
        }

        System.out.println("Even index sum = " + evenIndexSum);
        System.out.println("Odd index sum = " + oddIndexSum);
    }
}