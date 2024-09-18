/**
* Extends the buyer object file.
*
* Project_11
* @author Dutch Casadaban
* @version 4/24/2023
*/

public class PreferredBuyer extends Buyer {
   
   /**
   * Constructor class for PreferredBuyer.
   *
   * @param acctNumberIn -- passes the acctNumber in.
   * @param nameIn -- passes name in.
   */
   public PreferredBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Preferred Buyer";
   }
   
   /**
   * Calculates the award points.
   *
   * @return -- returns award points.
   */
   public int calcAwardPoints() {
      int awardPoints = 0;
      awardPoints += calcSubtotal();
      return awardPoints;
   }
   
   
   
}