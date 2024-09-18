/**
* Creates the NumberOperations object.
* 
* Activity_05
* @author Dutch Casadaban
   * @version 2/14/2023
*/
public class NumberOperations {
   //instance variables
   private int number;
   /**
   * Constructs the NumberOperations Object.
   *
   * @param numberIn -- takes in a number to perform operations.
   */
   //constructor
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
   * Returns the number value.
   *
   * @return -- returns the number.
   */
   public int getValue() {
      return number;
   }
   /**
   * Returns all odd numbers under user number.
   *
   * @return -- returns string with all odd numbers under user number.
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
   * Returns all powers under user number.
   *
   * @return -- returns all powers under user number.
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
   * Returns all odd numbers under user number.
   *
   * @param compareNumber -- number to compare to initial user number.
   * @return -- returns 1, 0, or -1 based on if the number
   * is greater or less than the user number.
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
   * Returns number from parameter.
   *
   * @return -- returns number from parameter.
   */
   public String toString() {
      return number + "";
   }
}