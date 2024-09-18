/**
* Extends the inventory Item object file.
*
* Activity_10
* @author Dutch Casadaban
* @version 4/10/2023
*/
public class ElectronicsItem extends InventoryItem {
   protected double weight = 0;
   
   /** Sets the shipping cost CONSTANT. */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * Constructor class for ElectronicsItem.
   *
   * @param nameIn - passes name in.
   * @param priceIn - passes price in.
   * @param weightIn - passes weight in.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * Overrides InventoryItem calculateCost.
   *
   * @return the price including tax.
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}