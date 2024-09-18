/**
* Extends the inventory Item object file for an eText.
*
* Activity_09
* @author Dutch Casadaban
* @version 4/03/2023
*/
public abstract class OnlineTextItem extends InventoryItem {
   
   /**
   * Constructor class for OnlineTextItem.
   *
   * @param nameIn - passes name in.
   * @param priceIn - passes price in.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   * Overides calculateCost to exclude tax.
   *
   * @return price without tax.
   */
   public double calculateCost() {
      return price;
   }
   
   
   
}