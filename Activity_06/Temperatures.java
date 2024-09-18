//imports
import java.util.ArrayList;
/**
* Creates the temperatures class.
*
* Activity_06
* @author Dutch Casadaban
* @version 2/20/2023
*/
public class Temperatures {
   //instance variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

  /**
  * Constructor class for temperatures.
  *
  * @param temperaturesIn -- takes in an array of ints for temp.
  */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
  
  /**
  * Returns the low temperature.
  *
  * @return -- the low temperature to return.
  */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
  
  /**
  * Returns the high temperature.
  *
  * @return -- the high temperature to return.
  */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
  
  /**
  * Returns the low temperature.
  *
  * @param lowIn sees if its lower than returned getLowTemp.
  * @return -- the low temperature to return.
  */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
  
  /**
  * Returns the high temperature.
  *
  * @param highIn sees if its higher than returned getHighTemp.
  * @return -- the high temperature to return.
  */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
  
  /**
  * Returns formatted temperatures as string.
  *
  * @return -- a formatted string of temperatures.
  */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
  
}


