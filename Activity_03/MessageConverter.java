//imports
import java.util.Scanner;

/**
* A userInput program that alters a users message based on input.
*
* Activity_03
* @author Dutch Casadaban
* @version 1/30/2023
*/
public class MessageConverter {
   /**
   * Recieves user message and outputs an altered message.
   * 
   * @param args Command line args -- not used.
   */

   public static void main(String[] args) {
      //vars
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
      
      //get message
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      //get output type
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      
      //output selector logic
      if (outputType == 0) { //as is
         result = message;
      }
      else if (outputType == 1) { //trimmed
         result = message.trim();
      }
      else if (outputType == 2) { //lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { //upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { //vowels replaced
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) { //first and last char
         result = message.substring(1, message.length() - 1);
      }
      else { //invalid
         result = "Error: Invalid choice input.";
      }
      
      System.out.println("\n" + result);
   }
}