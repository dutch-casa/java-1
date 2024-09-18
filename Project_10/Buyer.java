//imports
import java.util.Arrays;
import java.text.DecimalFormat;

/**
* Buyer object file.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/

public abstract class Buyer implements Comparable<Buyer> {
   protected String category = "";
   protected String acctNumber = "";
   protected String name = "";
   protected double[] purchases;
   
   /**Tax rate constant.*/
   public static final double SALES_TAX_RATE = 0.08;
   
   /**
   * Constructor method for buyer class.
   *
   * @param acctNumberIn - passes acctNumber in.
   * @param nameIn - passes the name in.
   */
   public Buyer(String acctNumberIn, String nameIn) {
      acctNumber = acctNumberIn;
      name = nameIn;
      purchases = new double[0];
   }
   
   /**
   * Accessor method for acctNumber.
   *
   * @return -- returns account number.
   */
   public String getAcctNumber() {
      return acctNumber;
   }
    
   /**
   * Mutator method for acctNumber.
   *
   * @param acctNumberIn -- account number to set.
   */
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }
    
   /**
   * Accessor method for name.
   *
   * @return -- returns account name.
   */
   public String getName() {
      return name;
   }
    
   /**
   * Mutator method for name.
   *
   * @param nameIn -- name to set.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
    
   /**
   * Accessor method for purchases.
   *
   * @return -- returns purchases.
   */
   public double[] getPurchases() {
      return purchases;
   }
    
   /**
   * Mutator method for name.
   *
   * @param purchasesIn -- name to set.
   */
   public void setPurchases(double[] purchasesIn) {
      purchases = purchasesIn;
   }
    
   /**
   * Adds to the list.
   *
   * @param listIn -- passes list in.
   */
   public void addPurchases(double... listIn) {
      int newIdx = purchases.length; 
      
      purchases = Arrays.copyOf(purchases, purchases.length 
         + listIn.length);
      
      for (double newVal : listIn) {
         purchases[newIdx] = newVal;
         newIdx++;
      }
   }
   
   /**
   * Deletes certain items from the list.
   *
   * @param listIn -- passes list in.
   */
   public void deletePurchases(double... listIn) {
      for (int i = 0; i < listIn.length; i++) {
         for (int j = 0; j < purchases.length; j++) {
            if (purchases[j] == listIn[i]) {
               purchases[j] = 0.0;
               purchases = Arrays.copyOf(purchases, purchases.length - 1);
            }
         }
      }
   }
   
   /**
   * Calculates and returns the subtotal.
   *
   * @return -- returns the subtotal.
   */
   public double calcSubtotal() {
      double subtotal = 0.0;
      
      for (double i : purchases) {
         subtotal += i;
      }
      
      return subtotal;
   }
   
   /**
   * Calculates and returns the total.
   *
   * @return -- returns the total.
   */
   public double calcTotal() {
      return calcSubtotal() + (calcSubtotal() * SALES_TAX_RATE);
   }
   
   /**
   * Represents object as a string.
   *
   * @return -- the string representation of the object.
   */
   public String toString() {
      String output = "";
      DecimalFormat f = new DecimalFormat("$#,##0.00");
      
      output += category + "\nAcctNo/Name: " + acctNumber + " "
         + name + "\nSubtotal: " + f.format(calcSubtotal())
         + "\nTax: " + f.format(calcTotal() - calcSubtotal())
         + "\nTotal: " + f.format(calcTotal()) + "\nAward Points: "
         + calcAwardPoints();
      return output;
   }
   
   /**An abstract method returning an int for reward points.
   *
   * @return -- int for award points.
   */
   public abstract int calcAwardPoints();
   
   /**
   * A class to compare by name.
   * @return -- int for award points.
   * @param other -- the buyer to compare.
   */
   public int compareTo(Buyer other) {
      return this.name.compareTo(other.getName());
   }
}