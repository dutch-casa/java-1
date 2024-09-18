/**
* Makes a list of items.
*
* Activity_10
* @author Dutch Casadaban
* @version 4/10/2023
*/
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
   * Contructor for InventoryList.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
   * Contructor for InventoryList.
   *
   * @param itemIn -- passes in an item to add to the list.
   */
   public void addItem(InventoryItem itemIn) {
      count++;
      for (int i = 0; i < count; i++) {
         if (inventory[i] == null) {
            inventory[i] = itemIn;
            break;
         }
      }
   }
   
   /**
   * Contructor for InventoryList.
   *
   * @param electronicsSurcharge -- adds to price for electronics use.
   * @return -- returns total cost of InventoryList.
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] != null) {
            if (inventory[i] instanceof ElectronicsItem) {
               total += electronicsSurcharge + inventory[i].calculateCost();
            }
            else {
               total += inventory[i].calculateCost();
            }
         }
      }
      return total;
   }
   
   /**
   * Contructor for InventoryList.
   *
   * @return -- returns ItemsList as string.
   */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] != null) {
            output += inventory[i] + "\n";
         }
      }
      
      return output;
   }
}