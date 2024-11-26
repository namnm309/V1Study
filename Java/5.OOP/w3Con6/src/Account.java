public class Account {
    private String accountNumber;
    private double balance;

    public Account (String accountNumber,double balance){
        // if (accountNumber == null||accountNumber.isEmpty()){
        //     this.accountNumber=accountNumber;
        // } else {
        //     System.out.println("Error accountNumber !");
        // }

        // if (balance >=0){
        //     this.balance=balance;
        // } else {
        //     System.out.println("Error balance !");
        // }

        // Validate accountNumber
        if (accountNumber == null || accountNumber.isEmpty()) {
            // Print error message if accountNumber is null or empty
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }
        // Validate balance
        if (balance < 0) {
            // Print error message if balance is negative
            System.err.println("Error: Balance cannot be negative.");
            return;
        }
        // Initialize accountNumber with the provided parameter
        this.accountNumber = accountNumber;
        // Initialize balance with the provided parameter
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    

}
