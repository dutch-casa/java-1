/**
* Calculates various aspects of a customers bank loan.
*
* Project_07A
* @author Dutch Casadaban
* @version 3/13/2023
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;

   /**
   * Constructor class for the BankLoan.
   *
   * @param customerNameIn -- assigns customer name to a loan.
   * @param interestRateIn -- assigns an interest rate to a loan.
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }


   /**
   * Boolean to check and see if a customer has made a loan.
   *
   * @param amount -- the amount to calculate to see if a loan was made.
   * @return -- returns a boolean value to see if a loan was made.
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
   * Method to subtract from a users debt.
   *
   * @param amountPaid -- the amount to subtract from a users loan.
   * @return returns a value for either on overcharge or a new balance.
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * Accessor method for a users balance.
   *
   * @return -- returns a double representing a users balance.
   */
   public double getBalance() {
      return balance;
   }
   
   
   /**
   * Mutator method for a users interest rate.
   *
   * @param interestRateIn -- assigns customer name to a loan.
   * @return A boolean value true or false to see if the interest rate was set.
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * Accessor method for a users interest rate.
   *
   * @return -- returns a users interest rate.
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * Adds a users interest to their balance.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * Check class to see if an input amount is greater than zero.
   *
   * @param amount -- the amount to check the validitiy of.
   * @return -- true or false representing the validity of the amount.
   */
   public static boolean isAmountValid(double amount) {
      if (amount >= 0) {
         return true;
      }
      return false;
     
   }
   
   /**
   * Checks to see if a user is in debt to the bank.
   *
   * @param loan -- the loan to see if that user is in debt.
   * @return interestRateIn -- true if the user is in debt flase otherwise
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
   * Accessor method for loansCreated int.
   *
   * @return -- returns the amount of loans created. 
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   * Mutator method to reset loansCreated int to 0.
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
   
   /**
   * To string method to print a users loan info when called.
   *
   * @return -- returns a string for the loan output info.
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
