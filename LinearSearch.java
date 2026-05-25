//46
public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        int key = 30;
        int flag = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] == key) {
                System.out.println("Element found at index: " + i);
                flag = 1;
                break;
            }
        }

        if(flag == 0) {
            System.out.println("Element not found");
        }
    }
}