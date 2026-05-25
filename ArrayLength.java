//34. Find length of array without using length attribute
public class ArrayLength {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int count = 0;

        try {
            while (true) {
                int temp = arr[count];
                count++;
            }
        } catch (Exception e) {
            System.out.println("Length = " + count);
        }
    }
}