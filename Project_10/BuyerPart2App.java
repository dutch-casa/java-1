//imports
import java.io.FileNotFoundException;

/**
* Drives Buyer Processor.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/
public class BuyerPart2App {
   /**
   * Main method for BuyerPart2App.
   *
   * @param args -- command line arguments.
   */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
         return;
      }
        
      String fileName = args[0];
      BuyerProcessor buyerProcessor = new BuyerProcessor();
        
      try {
         buyerProcessor.readBuyerFile("");
      } catch (FileNotFoundException e) {
         System.out.println("File not found: " + fileName);
         return;
      }
      
      System.out.println("\nBuyer Report:");
      buyerProcessor.generateReport(); 
      
      System.out.println("Buyer Report by Name:");
      buyerProcessor.generateReportByName();
   
      System.out.println("\nBuyer Report by Total Purchases:");
      buyerProcessor.generateReportByTotalPurchases();

   }
}