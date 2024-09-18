/**
* Drives ItemsList.
*
* Activity_10
* @author Dutch Casadaban
* @version 4/10/2023
*/
public class InventoryListApp {
   
   /**
   * Main method of InventoryListApp.
   *
   * @param args -- Command line arguements. Not used.
   */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      ElectronicsItem ex1 = new ElectronicsItem("laptop", 1234.56, 10);
      InventoryItem ex2 = new InventoryItem("motor oil", 9.8);
      OnlineBook ex3 = new OnlineBook("All Things Java", 12.3);
      OnlineArticle ex4 = new OnlineArticle("Useful Acronyms", 3.4);
      
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(ex1);
      myItems.addItem(ex2);
      myItems.addItem(ex3);
      myItems.addItem(ex4);
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}