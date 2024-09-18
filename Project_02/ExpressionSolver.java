//imports
import java.util.Scanner;

/**
* A userInput program that solves an expression for xyz.
*
* Project_02
* @author Dutch Casadaban
* @version 1/23/2023
*/

public class ExpressionSolver {
   /**
   * Recieves user input and outputs age solved expression/undefined.
   * 
   * @param args Command line args -- not used.
   */
   public static void main(String[] args) {
      //Declare vars
      Scanner userInput = new Scanner(System.in);
      double varX = 0.0;
      double varY = 0.0;
      double varZ = 0.0;
      double solution = 0.0;
      
      System.out.println("result = (7.1x + 3.6) (5.0y + 4.9) "
         + "(2.5z - 5.2) / xyz");
      
      //inputs
      System.out.print("\tEnter x: ");
      varX = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      varY = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      varZ = userInput.nextDouble();
      
      //math logic
      if (varX * varY * varZ == 0) {
         System.out.println("result is undefined");
      }
      else {
         solution = (7.1 * varX + 3.6) * (5.0 * varY + 4.9);
         solution *= (2.5 * varZ - 5.2);
         solution = solution / (varX * varY * varZ);
         System.out.println("result = " + solution);
      }
   }
}