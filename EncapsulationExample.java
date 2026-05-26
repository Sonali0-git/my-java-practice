class Student {

    // Private data member
    private int marks;

    // Setter method
    public void setMarks(int m) {
        marks = m;
    }

    // Getter method
    public int getMarks() {
        return marks;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        Student s = new Student();

        // Setting value using method
        s.setMarks(90);

        // Getting value using method
        System.out.println("Marks: " + s.getMarks());
    }
}