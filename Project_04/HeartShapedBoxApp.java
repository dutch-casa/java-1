//imports
import java.util.Scanner;

/**
* Drives the input for the Heart Shaped Box.
*
* Project_04
* @author Dutch Casadaban
* @version 2/08/2023
*/

public class HeartShapedBoxApp {
   /**
   * The main method to input the values for the Heart Shaped Box object.
   *
   * @param args Command line args -- not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String labelIn = "";
      double radiusIn = 0.0;
      double heightIn = 0.0;
      
      System.out.println("Enter label, radius, and height"
         + " for a heart shaped box.");
      System.out.print("\tlabel: ");
      labelIn = userInput.nextLine();
      
      System.out.print("\tradius: ");
      radiusIn = Double.parseDouble(userInput.nextLine());
      if (radiusIn <= 0) {
         System.out.println("Error: radius must be greater than zero.");
         return;
      }
      
      System.out.print("\theight: ");
      heightIn = Double.parseDouble(userInput.nextLine());
      if (heightIn <= 0) {
         System.out.println("Error: height must be greater than zero.");
         return;
      }
      
      HeartShapedBox userBox = new HeartShapedBox(labelIn, radiusIn, heightIn);
      System.out.println("\n" + userBox);
      
   }
}