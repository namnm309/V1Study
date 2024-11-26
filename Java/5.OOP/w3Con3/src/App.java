public class App {
    public static void main(String[] args) throws Exception {
        // Create a new Book object using the default constructor
        Book book1 = new Book();
        // Print the values of the instance variables for book1
        System.out.println("Book1 Title: " + book1.getTitle());
        System.out.println("Book1 Author: " + book1.getAuthor());
        System.out.println("Book1 Price: " + book1.getPrice());

        // Create a new Book object using the parameterized constructor (title, author)
        Book book2 = new Book("Amatka", "Karin Tidbeck");
        // Print the values of the instance variables for book2
        System.out.println("Book2 Title: " + book2.getTitle());
        System.out.println("Book2 Author: " + book2.getAuthor());
        System.out.println("Book2 Price: " + book2.getPrice());

        // Create a new Book object using the parameterized constructor (title, author, price)
        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18);
        // Print the values of the instance variables for book3
        System.out.println("Book3 Title: " + book3.getTitle());
        System.out.println("Book3 Author: " + book3.getAuthor());
        System.out.println("Book3 Price: " + book3.getPrice());
    }
}
