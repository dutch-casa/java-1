//imports
import java.util.Comparator;

/**
* Sorts buyers by total.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/
public class TotalPurchasesCompare implements Comparator<Buyer> {
   /**
   * Sorts buyers by total purchased.
   *
   * @param b1 -- first buyer to compare.
   * @param b2 -- second buyer to compare.
   * @return -- an int value to help sort.
   */
   public int compare(Buyer b1, Buyer b2) {
      double total1 = b1.calcTotal();
      double total2 = b2.calcTotal();
      
      if (total1 > total2) {
         return -1;
      } else if (total1 < total2) {
         return 1;
      } else {
         return 0;
      }
   }
}