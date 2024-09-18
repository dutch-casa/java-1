/**
* Inventory Item object file.
*
* Activity_10
* @author Dutch Casadaban
* @version 4/10/2023
*/

public class InventoryItem {
   //vars
   protected String name = "";
   protected double price = 0.0;
   private static double taxRate = 0;
   
   /**
   * Constructor class for InventoryItem.
   *
   * @param nameIn -- passes the name to initialize object.
   * @param priceIn -- passes the price in to initialize object.
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
   * Returns the object's name.
   *
   * @return the objects name.
   */
   public String getName() {
      return name;
   }
   
   /**
   * Returns the price including tax.
   *
   * @return the price including tax.
   */
   public double calculateCost() {
      double taxPrice = price * (1 + taxRate);
      return taxPrice;
   }
   
   /**
   * Mutator method for tax rate.
   *
   * @param taxRateIn -- sets the tax rate.
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
   * Return string representation of InventoryItem.
   *
   * @return -- returns the string representation.
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
   
}