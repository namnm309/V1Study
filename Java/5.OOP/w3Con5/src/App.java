public class App {
    public static void main(String[] args) throws Exception {
        // Create a new Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(12.5, 4.5);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect1.getLength());
        System.out.println("Rectangle 1 Width: " + rect1.getWidth());

        // Create a new Rectangle object using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        // Print the values of the instance variables for rect2
        System.out.println("Rectangle 2 Length: " + rect2.getLength());
        System.out.println("Rectangle 2 Width: " + rect2.getWidth());
    }
}
