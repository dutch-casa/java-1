//imports
import java.util.ArrayList;
import java.text.DecimalFormat;

/**
* Creates the HeartShapedBoxList object.
*
* Project_05
* @author Dutch Casadaban
* @version 2/16/2023
*/

public class HeartShapedBoxList {
   //instance variables
   private String label = "";
   private ArrayList<HeartShapedBox> list 
      = new ArrayList<HeartShapedBox>();
      
   /**
   * Constructor class for the HeartShaped Box list.
   *
   * @param labelIn -- passes in a string for the label.
   * @param listIn -- passes in the HeartShapedBox list.
   */
   public HeartShapedBoxList(String labelIn,
      ArrayList<HeartShapedBox> listIn) {
      label = labelIn;
      list = listIn;
   }
   
   /**
   * Returns the label for the object name.
   *
   * @return -- returns the label.
   */
   public String getName() {
      return label;
   }
   
   /**
   * Returns an int with the size of the list.
   *
   * @return -- returns an int size.
   */
   public int numberOfHeartShapedBoxes() {
      if (list.size() > 0) {
         return list.size();
      }
      else {
         return 0;
      }
   }
   
   /**
   * Returns the sum of surface area of all in the list.
   *
   * @return -- returns a double for sum of surface area.
   */
   public double grandTotalSurfaceArea() {
      double grandSum = 0.0;
      int i = 0;
      while (i < list.size()) {
         grandSum += list.get(i).totalSurfaceArea();
         i++;
      }
      return grandSum;
   }
   /**
   * Calculates the total volume of all the objects.
   *
   * @return -- returns the sum of the volume of all objects in list.
   */
   public double totalVolume() {
      double volSum = 0.0;
      int i = 0;
      while (i < list.size()) {
         volSum += list.get(i).volume();
         i++;
      }
      return volSum;
   }
   
   /**
   * Calculates the average surface area of all the objects.
   *
   * @return -- returns the average
   * of the surface area of all objects in list.
   */
   public double averageTotalSurfaceArea() {
      double avg = 0.0;
      int i = 0;
      while (i < list.size()) {
         avg += list.get(i).totalSurfaceArea() / list.size();
         i++;
      }
      return avg;
   }
   
   /**
   * Calculates the average volume of all the objects.
   *
   * @return -- returns the average
   * of the volume of all objects in list.
   */
   public double averageVolume() {
      double avg = 0.0;
      int i = 0;
      while (i < list.size()) {
         avg += list.get(i).volume() / list.size();
         i++;
      }
      return avg;
   }
   
   /**
   * Returns formatted string.
   *
   * @return -- returns formatted string.
   */
   public String toString() {      
      String output = "";
      output += "----- " + label + " -----\n";
      int i = 0;
      while (i < list.size()) {
         output += "\n" + list.get(i) + "\n";
         i++;
      }
      return output;
   }
   
   
   /**
   * Returns summary of objects in list.
   *
   * @return -- returns summart if objects in list.
   */
   public String summaryInfo() {
      DecimalFormat formatter = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + label + " -----";
      output += "\nNumber of HeartShapedBoxes: "
         + numberOfHeartShapedBoxes();
      output += "\nTotal Surface Area: "
         + formatter.format(grandTotalSurfaceArea()) + " square units";
      output += "\nTotal Volume: "
         + formatter.format(totalVolume()) + " cubic units";
      output += "\nAverage Surface Area: "
         + formatter.format(averageTotalSurfaceArea()) + " square units";
      output += "\nAverage Volume: "
         + formatter.format(averageVolume()) + " cubic units";
      return output;
   }
   
}