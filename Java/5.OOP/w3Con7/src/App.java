public class App {
    public static void main(String[] args) throws Exception {
        // Create a new Car object with valid data
        Car car1 = new Car("Toyota", "Corolla", 2021);
        // Print the values of the instance variables for car1
        System.out.println("Car 1 Make: " + car1.getMake());
        System.out.println("Car 1 Model: " + car1.getModel());
        System.out.println("Car 1 Year: " + car1.getYear());

        // Create a new Car object with some invalid data
        Car car2 = new Car("", "", -1);
        // Print the values of the instance variables for car2
        System.out.println("Car 2 Make: " + car2.getMake());
        System.out.println("Car 2 Model: " + car2.getModel());
        System.out.println("Car 2 Year: " + car2.getYear());
    }
}
