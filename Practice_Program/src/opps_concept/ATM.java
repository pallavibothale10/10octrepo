package opps_concept;


	public class ATM {
	    private int availableBalance;
	    private String customerName;
	    private int pin;

	    // Constructor
	    public ATM(String customerName, int pin) {
	        this.customerName = customerName;
	        this.pin = pin;
	       this.availableBalance = 1000; // Set initial available balance to 1000
	    }

	    // Getter for the availableBalance field
	    public int getAvailableBalance() {
	        return availableBalance;
	    }

	    // Method to display account information
	    public void displayAccountInfo() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Available Balance: " + availableBalance);
	    }

	    // Method to withdraw money
	    public void withdraw(int amount) {
	        if (amount > 0 && amount <= availableBalance) {
	            availableBalance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    // Method to deposit money
	    public void deposit(int amount) {
	        if (amount > 0) {
	            availableBalance += amount;
	            System.out.println(amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to change PIN
	    public void changePIN(int newPIN) {
	        pin = newPIN;
	        System.out.println("PIN changed successfully.");
	    }

	    // Method to verify PIN
	    public boolean verifyPIN(int enteredPIN) {
	        return pin == enteredPIN;
	    }

}
