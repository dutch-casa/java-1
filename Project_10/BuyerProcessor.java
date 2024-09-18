//imports
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
* Processes the different buyers.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/
public class BuyerProcessor {
   private Buyer[] buyerArray;
   private String[] invalidRecordsArray;
   
   /**Constructor array for BuyerProcessor.*/
   public BuyerProcessor() {
      buyerArray = new Buyer[0];
      invalidRecordsArray = new String[0];
   }
   
   /**
   * Accessor class for the buyerArray.
   *
   * @return -- returns the buyerArray.
   */
   public Buyer[] getBuyerArray() {
      return buyerArray;
   }
   
   /**
   * Accessor class for the invalidRecordsArray.
   *
   * @return -- returns the invalidRecordsArray.
   */
   public String[] getInvalidRecordsArray() {
      return invalidRecordsArray;
   }
   
   /**
   * Adds a buyer to the buyerArray.
   *
   * @param buyerIn -- passes in buyer to add to the array.
   */
   public void addBuyer(Buyer buyerIn) {
      buyerArray = 
         Arrays.copyOf(buyerArray, buyerArray.length + 1);
      for (int i = 0; i < buyerArray.length; i++) {
         if (buyerArray[i] == null) {
            buyerArray[i] = buyerIn;
         }
      }
   }
   
   /**
   * Adds an invalidRecord to the invalidRecordsArray.
   *
   * @param recordIn -- passes in invalidRecord to add to the array.
   */
   public void addInvalidRecord(String recordIn) {
      invalidRecordsArray = 
         Arrays.copyOf(invalidRecordsArray, invalidRecordsArray.length + 1);
      for (int i = 0; i < invalidRecordsArray.length; i++) {
         if (invalidRecordsArray[i] == null) {
            invalidRecordsArray[i] = recordIn;
         }
      }
   }
   
   /**
   * Reads in a file.
   *
   * @param f -- passes in string name of file to read.
   * @throws FileNotFoundException -- throws error if file isn't found.
   */
   public void readBuyerFile(String f) throws FileNotFoundException {
      Scanner s = new Scanner(new File(f));
      Buyer buyerIn;
      while (s.hasNextLine()) {
         double[] purchases = new double[0];
  
         String line = s.nextLine();
     
         Scanner l = new Scanner(line);
     
         int category = l.nextInt();
     
         String acctNumber = l.next();
     
         String name = l.next();
     
         name += ", " + l.next();
     

         while (l.hasNextDouble()) {
            purchases = Arrays.copyOf(purchases, purchases.length + 1);
            purchases[purchases.length - 1] = l.nextDouble();
         }
         if (category == 1) {
            buyerIn = new PreferredBuyer(acctNumber, name);
         }
         else if (category == 2) {
            buyerIn = new EliteBuyer(acctNumber, name);
         } 
         else {
            buyerIn = new PremierEliteBuyer(acctNumber, name);
         }
         
         buyerIn.addPurchases(purchases);
         addBuyer(buyerIn);
      } 
      s.close();
   }
   
   /**
   * Generates a report of all buyers in the original order from the file.
   *
   * @return The report as a String.
   */
   public String generateReport() {
      String report = "----------------------------\n";
      report += "Buyer Report\n";
      report += "----------------------------\n";
      for (Buyer buyer : buyerArray) {
         report += buyer.toString() + "\n\n";
      }
      return report;
   }
   
   /**
   * Sorts the buyerArray by name and generates a report.
   * 
   * @return the report as a String
   */
   public String generateReportByName() {
      Arrays.sort(buyerArray);
      String report = "----------------------------\n";
      report += "Buyer Report by Name\n";
      report += "----------------------------\n";
      for (Buyer buyer : buyerArray) {
         report += buyer.toString() + "\n\n";
      }
      return report;
   }
   
   /**
   * Sorts the buyerArray by name and generates a report.
   * 
   * @return the report as a String
   */
   public String generateReportByTotalPurchases() {
      Arrays.sort(buyerArray, new TotalPurchasesCompare());
      String report = "----------------------------\n";
      report += "Buyer Report by Total Purchases\n";
      report += "----------------------------\n";
      for (Buyer buyer : buyerArray) {
         report += buyer.toString() + "\n\n";
      }
      return report;
   }
   
}