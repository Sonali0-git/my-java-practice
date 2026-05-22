// 11. Java program to print prime numbers present in an array
public class PrimeNumbersInArray {

    static boolean isPrime(int n) {
        if(n < 2) return false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.print("Output: ");
        for(int i : arr) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}