//imports
import java.util.Scanner;

/**
* A userInput program that calculates different age stats.
*
* Activity_02
* @author Dutch Casadaban
* @version 1/23/2023
*/
public class AgeStatistics 
{
   /**
   * Recieves user input and outputs age statitics based on that input.
   * 
   * @param args Command line args -- not used.
   */
   public static void main(String[] args)
   {
      //vars
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Name input
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Age input
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Gender input
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      //Max female heartrate calc
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      //Max male heartrate calc
      else {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      //display heartrate
      System.out.print("Your max heart rate is "
         + maxHeartRate + " beats per minute.");
   }
}