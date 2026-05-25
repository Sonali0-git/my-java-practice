//12. Spy Number
class SpyNumbers {
    public static void main(String[] args) {

        int n = 123;
        int sum = 0, product = 1;

        while(n > 0) {

            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }

        if(sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}