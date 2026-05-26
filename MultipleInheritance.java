interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Test implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.print();
        obj.show();
    }
}