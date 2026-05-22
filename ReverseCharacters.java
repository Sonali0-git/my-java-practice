// 1. Java program to store characters in an array and print them in reverse order

public class ReverseCharacters {
    public static void main(String[] args) {

        char[] ch = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Characters in reverse order:");

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}