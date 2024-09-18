/**
* Division methods.
*
* Activity_11
* @author Dutch Casadaban
* @version 4/17/2023
*/

public class Division {
   
   /**
   * Class to divide as int.
   *
   * @param num -- number to be divided.
   * @param denom -- number that divides.
   * @return int -- returns the result of type int.
   */
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
   * Class to divide as double.
   *
   * @param num -- number to be divided.
   * @param denom -- number that divides.
   * @return int -- returns the result of type double.
   * @throws IllegalArgumentException -- Catches denom of 0.
   */
   public static double decimalDivide(double num, double denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return num / denom;
   }
}