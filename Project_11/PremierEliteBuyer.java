//imports
import java.text.DecimalFormat;

/**
* Extends the buyer object file for premier elite buyer.
*
* Project_11
* @author Dutch Casadaban
* @version 4/24/2023
*/



public class PremierEliteBuyer extends EliteBuyer {
   private int bonusAwardPoints = 1000;
   
   /**
   * Constructor class for PremierEliteBuyer.
   *
   * @param acctNumberIn -- passes the acctNumber in.
   * @param nameIn -- passes name in.
   */
   public PremierEliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Premier Elite Buyer";
      discountRate = 0.15;
   }
   
   
   /**
   * Accessor method for the BonusAwardPoints.
   *
   * @return -- returns bonus award points.
   */
   public int getBonusAwardPoints() {
      return bonusAwardPoints;
   }
   
   /**
   * Mutator method for the BonusAwardPoints.
   *
   * @param pointsIn -- sets award points.
   */
   public void setBonusAwardPoints(int pointsIn) {
      bonusAwardPoints = pointsIn;
   }
   
   /**
   * Calculates the award points.
   *
   * @return -- returns award points.
   */
   public int calcAwardPoints() {
      int awardPoints = 0;
      awardPoints += (calcSubtotal() / 1);
      awardPoints *= 20;
      if (calcSubtotal() > 500) {
         return awardPoints + bonusAwardPoints;
      }
      return awardPoints;
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
         + calcAwardPoints() + "\n(includes 0.15 discount rate "
         + "applied to Subtotal)";
      if (calcSubtotal() > 500) {
         output += "\n(includes 1000 bonus points added to Award Points)";
      }
      return output;
   }

}