package opps_concept;

public class Client_ATM {
	
	    public static void main(String[] args) {
	        ATM atm = new ATM("John Doe", 1234); // Create a new ATM instance with customer name and PIN

	        if (atm.verifyPIN(1234)) {
	            atm.displayAccountInfo(); // Display account information
	            atm.withdraw(500); // Withdraw 500
	            atm.deposit(200); // Deposit 200
	            atm.changePIN(4321); // Change PIN to 4321
	        } else {
	            System.out.println("Invalid PIN.");
	        }
	    
	
	    ATM atm1 = new ATM("John both", 1235); // Create a new ATM instance with customer name and PIN

        if (atm1.verifyPIN(1235)) {
            atm1.displayAccountInfo(); // Display account information
            atm1.withdraw(500); // Withdraw 500
            atm1.deposit(200); // Deposit 200
            atm1.changePIN(4321); // Change PIN to 4321
        } else {
            System.out.println("Invalid PIN.");
        }
    }


	    

}
