import java.io.FileNotFoundException;

/**
* Drives buyer for this 3rd part of the project.
*
* Project_11
* @author Dutch Casadaban
* @version 4/24/2023
*/


public class BuyerPart3App {
   /**
   * Drives the buyer processor.
   *
   * @param args -- command line arguments.
   */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument. \n"
            + "Program ending.");
            
         return;
      }
      
      String name = args[0];
      BuyerProcessor bp = new BuyerProcessor();
      
      try {
         bp.readBuyerFile(name);
      }
      catch (FileNotFoundException e) {
         System.out.println("Attempted to read file: " + name
            + " (no such file or directory)\n" + "Program ending.");
         return;
      }
      
      String report1 = bp.generateReport();
      String report2 = bp.generateReportByName();
      String report3 = bp.generateReportByTotalPurchases();
      String report4 = bp.generateInvalidRecordsReport();
      
      System.out.println(report1);
      System.out.println(report2);
      System.out.println(report3);
      System.out.println(report4);
      
   }
}