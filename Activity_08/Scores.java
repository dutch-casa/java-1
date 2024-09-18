//imports
/**
* Creates the Quatrefoil object.
*
* Activity_08
* @author Dutch Casadaban
* @version 3/27/2023
*/
public class Scores {
   private int[] numbers;
   
   /**
   * Constructor class for the Quatrefoil object.
   *
   * @param numbersIn -- the array of numbers to pass into the constructor.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   
   /**
   * Returns an array list of even numbers.
   *
   * @return -- returns the even numbers.
   */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
   * Returns an array list of odd numbers.
   *
   * @return -- returns the odd numbers.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   
   /**
   * Calculates the average of the array.
   *
   * @return -- a double that is the calculated average.
   */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      return Double.valueOf(sum) / Double.valueOf(numbers.length);
      
   }
   
   /**
   * Returns the array list.
   *
   * @return -- returns the number array.
   */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   
   /**
   * Returns the array list in reverse.
   *
   * @return -- returns the number array in reverse.
   */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}