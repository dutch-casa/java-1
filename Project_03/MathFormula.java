//imports
import java.util.Scanner;
import java.text.DecimalFormat;

/**
* A program that solves a formula with a user given x value.
*
* Project_03
* @author Dutch Casadaban
* @version 2/02/2023
*/
public class MathFormula {
   /**
   * Solves a given formula with math package and user x value.
   * 
   * @param args Command line args -- not used.
   */
   public static void main(String[] args) {
      //vars
      Scanner userInput = new Scanner(System.in);
      double val = 0;
      double calcVal = 0.0;
      String valString = "";
      DecimalFormat formattedResult = new DecimalFormat("#,##0.0##");
      
      //user input
      System.out.print("Enter a value for x: ");
      val = userInput.nextDouble();
      
      //calculation
      calcVal = Math.pow(val, 9) + 10;
      calcVal /= Math.abs((5 * Math.pow(val, 3)) - (3 * Math.pow(val, 2)))
         + Math.sqrt(((4 * Math.pow(val, 6)) - (2 * Math.pow(val, 2)) + 1));
      //display results
      System.out.println("Result: " + calcVal);
      valString = Double.toString(calcVal);
      //to the left
      System.out.println("# digits to left of decimal point: "
         + (valString.indexOf(".")));
     //to the right
      System.out.println("# digits to right of decimal point: "
         + (valString.length() - valString.indexOf(".") - 1));
     //formatted result
      System.out.println("Formatted Result: "
         + formattedResult.format(calcVal));
   }
}