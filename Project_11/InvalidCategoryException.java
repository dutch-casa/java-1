

/**
* Creates a new exception for an invalid category of buyer.
*
* Project_11
* @author Dutch Casadaban
* @version 4/24/2023
*/

public class InvalidCategoryException extends Exception {
   /**
   * Creates a new exception.
   *
   * @param categoryIn -- passes invalid category in.
   */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + "\"" + categoryIn + "\"");
   }
}