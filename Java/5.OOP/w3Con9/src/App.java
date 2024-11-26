public class App {
    public static void main(String[] args) throws Exception {
        // Create an array of student names
        String[] studentArray = {"Andrine", "Ruslan", "Martin"};
        // Create a Classroom object using the parameterized constructor
        Classroom classroom = new Classroom("Science 101", studentArray);
        // Print the values of the instance variables
        classroom.display();
    }
}
