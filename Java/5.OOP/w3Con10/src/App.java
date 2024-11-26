public class App {
    public static void main(String[] args) throws Exception {
        // Get the single instance of Singleton
        Singleton instance1 = Singleton.getInstance();
        // Try to get another instance of Singleton
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
    }

