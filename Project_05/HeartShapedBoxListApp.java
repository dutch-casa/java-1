//imports
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
* Drives the HeartSHapedBoxList object.
*
* Project_05
* @author Dutch Casadaban
* @version 2/16/2023
*/
public class HeartShapedBoxListApp {
   /**
   * The main method to drive the app.
   *
   * @param args Command line args -- not used.
   * @throws FileNotFoundException -- makes sure the file is present.
   */
   public static void main(String[] args) 
      throws FileNotFoundException {
      //variables
      ArrayList<HeartShapedBox> userList =
         new ArrayList<HeartShapedBox>();   
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = userInput.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      String listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine().trim();
         double radiusIn = scanFile.nextDouble();
         scanFile.nextLine();
         double heightIn = scanFile.nextDouble();
         scanFile.nextLine();
         HeartShapedBox h = 
            new HeartShapedBox(labelIn, radiusIn, heightIn);
         userList.add(h);
      }
      scanFile.close();
      
      HeartShapedBoxList myHearts =
         new HeartShapedBoxList(listName, userList);
      
      System.out.println("\n" + myHearts);
      System.out.println("\n" + myHearts.summaryInfo());
   }
}