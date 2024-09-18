
/**
* Creates the Customer object.
*
* Activity_07B
* @author Dutch Casadaban
* @version 3/20/2023
*/
public class Customer implements Comparable<Customer> {
   
   //instance variables
   private String name = "";
   private String location = "";
   private double balance = 0;
   
   
   /**
   * Constructor class for the customer object.
   *
   * @param nameIn -- sets the customers name
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
   * Mutator class for the customer's location.
   *
   * @param locationIn -- sets the customers location
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   * Mutator class for the customer's location.
   *
   * @param city -- sets the customers city.
   * @param state -- sets the customers state.
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
   * Mutator class for the customer's balance.
   *
   * @param amount -- adds or subtracts the customers balance
   */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
   * Accessor class for the customer's location.
   *
   * @return -- returns the customers location.
   */
   public String getLocation() {
      return location;
   }
   
   /**
   * Accessor class for the customer's balance.
   *
   * @return -- returns the customers balance.
   */
   public double getBalance() {
      return balance;
   }
   
   
   /**
   * Returns a formatted form of a customers data.
   *
   * @return -- returns formatted customer data.
   */
   public String toString() {
      String output = "";
      output += name + "\n";
      output += location + "\n";
      output += "$" + balance;
      return output;
   }
   
   /**
   * Allows us to compare 2 customers.
   *
   * @param obj -- the Customer object to compare balance of.
   * @return -- returns a number to signify compared balances.
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //equal
      }
      else if (this.balance < obj.getBalance()) {
         return -1; //less than
      }
      else {
         return 1;
      }
   }
}