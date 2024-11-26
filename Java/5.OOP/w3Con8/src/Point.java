public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        // Initialize instance variables
        this.x = x;
        this.y = y;
    }

    // Constructor that takes double parameters
    public Point(double x, double y) {
        // Initialize instance variables by casting double to int
        this.x = (int) x;
        this.y = (int) y;
    }

    // Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
}
