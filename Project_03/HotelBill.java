//imports
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;


/**
* A program that uses a 22 digit code for hotel billing info.
*
* Project_03
* @author Dutch Casadaban
* @version 2/03/2023
*/
public class HotelBill {
   /**
   * Uses 22 digit code to display hotel bill info.
   * 
   * @param args Command line args -- not used.
   */
   public static void main(String[] args) {
      //vars
      Scanner userInput = new Scanner(System.in);
      String billCode = "";
      int nights = 0;
      double costPerNight = 0.0;
      double tax = 0.0;
      double total = 0.0;
      Random newRand = new Random();
      int luckyNumber = 1 + newRand.nextInt(999999);
      DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat luckyNumberFormat = new DecimalFormat("000000");
      
      
      //input
      System.out.print("Enter hotel bill code: ");
      billCode = userInput.nextLine().trim();
      
      if (billCode.length() <= 21) {
         System.out.println("\nInvalid Hotel Bill Code.");
         System.out.println("Hotel Bill Code must have "
            + "at least 22 characters.");
      }
      else {
         //print name
         System.out.println("\nName: " 
            + billCode.substring(21, billCode.length()));
        //print room #
         System.out.println("Room: "
            + billCode.substring(0, 3));
        //check in date
         System.out.println("Check-in Date: "
            + billCode.substring(9, 19));
        //# nights
         nights = Integer.parseInt(billCode.substring(19, 21));
         System.out.println("Nights: " 
            + nights);
        //Cost per night
         costPerNight = Double.valueOf(billCode.substring(3, 9));
         tax = costPerNight * .15;
        
         System.out.println("Cost Per Night: "
            + (decimalFormat.format(costPerNight + tax)) + "   (Room: " 
            + decimalFormat.format(costPerNight) + "   Tax: "
            + decimalFormat.format(tax) + ")");
         costPerNight += tax;
        //Total
         total = costPerNight * nights;
         System.out.println("Total: " + decimalFormat.format(total));
        
        //Lucky number
         System.out.println("Lucky Number: "
            + luckyNumberFormat.format(luckyNumber));
      }
   }
}