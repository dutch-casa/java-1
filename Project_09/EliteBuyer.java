//imports
import java.text.DecimalFormat;
/**
* Extends the buyer object file for elite buyer.
*
* Project_09
* @author Dutch Casadaban
* @version 4/06/2023
*/

public class EliteBuyer extends Buyer {
   protected double discountRate = 0.05;
   /**
   * Constructor class for EliteBuyer.
   *
   * @param acctNumberIn -- passes the acctNumber in.
   * @param nameIn -- passes name in.
   */
   public EliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Elite Buyer";
   }
   
   /**
   * Accessor method for discount rate.
   *
   * @return -- returns discount rate.
   */
   public double getDiscountRate() {
      return discountRate;
   }
   
   /**
   * Mutator method for discount rate.
   *
   * @param rateIn -- value to set the rate to.
   */
   public void setDiscountRate(double rateIn) {
      discountRate = rateIn;
   }
   
   /**
   * Calculates the award points.
   *
   * @return -- returns award points.
   */
   public int calcAwardPoints() {
      int awardPoints = 0;
      awardPoints += (calcSubtotal() / 1);
      return awardPoints * 10;
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
      subtotal -= (subtotal * (1 + discountRate) - subtotal);
      return subtotal;
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
         + calcAwardPoints() + "\n(includes 0.05 discount rate "
         + "applied to Subtotal)";
      return output;
   }
}