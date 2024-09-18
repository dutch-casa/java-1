//imports
import java.util.Scanner;

/**
* A userInput program that converts seconds to other units of time.
*
* Project_02
* @author Dutch Casadaban
* @version 1/23/2023
*/
public class TimeConverter {
   /**
   * Recieves user input of seconds and converts/outputs new units of time.
   * 
   * @param args Command line args -- not used.
   */
   public static void main(String[] args) {
      //declare vars
      Scanner userInput = new Scanner(System.in);
      int userSeconds = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int newSeconds = 0;
      
      //Get input
      System.out.print("Enter the raw time measurement in seconds: ");
      userSeconds = userInput.nextInt();
      if (userSeconds <= 0) {
         System.out.print("Measurement must be non-negative!");
      }
      else {
         //time conversion logic
         days = userSeconds / 60 / 60 / 24;
         hours = userSeconds / 60 / 60 % 24;
         minutes = userSeconds / 60 % 60;
         newSeconds = userSeconds % 60;
      
         //print conversion
         System.out.println();
         System.out.println("Measurement by combined days, "
            + "hours, minutes, seconds: ");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + newSeconds + "\n");
         
         System.out.println(userSeconds + " seconds = " + days + " days, "
            + hours + " hours, " + minutes + " minutes, "
            + newSeconds + " seconds");
      }
   }
}