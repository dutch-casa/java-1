//imports
import java.text.DecimalFormat;

/**
* Creates the Quatrefoil object.
*
* Project_07A
* @author Dutch Casadaban
* @version 3/15/2023
*/
public class Quatrefoil {
   //instance variables
   private String label = "";
   private double diameter = 0.0;
   private static int quatrefoilCount = 0;
   
   /**
   * Constructor class for the Quatrefoil object.
   *
   * @param labelIn -- assigns label to a quatrefoil.
   * @param diameterIn -- assigns diameter to a quatrefoil.
   */
   public Quatrefoil(String labelIn, double diameterIn) {
      setLabel(labelIn);
      setDiameter(diameterIn);
      
      quatrefoilCount++;
   }
   
   /**
   * Accessor method for a quatrefoils label.
   *
   * @return -- returns the label for access.
   */
   public String getLabel() {
      return label;
   }
   /**
   * Method to check and set a label for a quatrefoil.
   *
   * @param labelIn -- assigns customer name to a loan.
   * @return -- returns true if set and false if invalid
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   /**
   * Accessor method for a quatrefoils diameter.
   *
   * @return -- returns a double to access the diameter.
   */
   public double getDiameter() {
      return diameter;
   }
   
   /**
   * Method to check and set a diameter for a quatrefoil.
   *
   * @param diameterIn -- assigns customer name to a loan.
   * @return -- returns true if set and false if invalid
   */
   public boolean setDiameter(double diameterIn) {
      if (diameterIn > 0) {
         diameter = diameterIn;
         return true;
      }
      return false;
   }
   
   /**
   * Calculates and returns the perimeter of the quatrefoil.
   *
   * @return -- returns the calculated perimeter of the quatrefoil in inches.
   */
   public double perimeter() {
      double perimeter = Math.PI * diameter;
      return perimeter;
   }
   
   /**
   * Calculates and returns the perimeter of the quatrefoil in feet.
   *
   * @return -- returns the calculated perimeter of the quatrefoil in feet.
   */
   public double perimeterInFt() {
      double perimeterFt = (Math.PI * diameter) / 12;
      return perimeterFt;
   }
   
   /**
   * Calculates and returns the area of the quatrefoil.
   *
   * @return -- returns the calculated area of the quatrefoil in inches.
   */
   public double area() {
      double r = diameter / 2;
      double area = Math.pow(r, 2) + 2 * (Math.PI * Math.pow(r, 2) / 4);
      return area;
   }
   
   /**
   * Calculates and returns the area of the quatrefoil in square feet.
   *
   * @return -- returns the calculated area of the quatrefoil in sq. feet.
   */
   public double areaInSqFt() {
      double r = diameter / 2;
      double areaFt = (Math.pow(r, 2) + 2 * (Math.PI * Math.pow(r, 2) / 4))
         / 144;
      return areaFt;
   }
   
   /**
   * Formats and creates a text output to represent the quatrefoil.
   *
   * @return -- returns a string representing data from the quatrefoil.
   */
   public String toString() {
      DecimalFormat formatter = new DecimalFormat("#,##0.0##");
      String output = "";
      //initial line info
      output += "Quatrefoil \"" + label + "\" with diameter "
         + formatter.format(diameter) + " inches has:\n";
      //perimeter info
      output += "\tperimeter = " + formatter.format(perimeter()) + " inches"
         + " (or " + formatter.format(perimeterInFt()) + " feet)\n";
      //area info
      output += "\tarea = " + formatter.format(area()) + " square inches"
         + " (or " + formatter.format(areaInSqFt()) + " square feet)";
         
      //return
      return output;
   }
   
   /**
   * Accessor method for the count of quatrefoils.
   *
   * @return -- returns a string representing data from the quatrefoil.
   */
   public static int getCount() {
      return quatrefoilCount;
   }
   
   /**
   * Mutator method for quatrefoilCount to reset count to zero.
   */
   public static void resetCount() {
      quatrefoilCount = 0;
   }
   
   /**
   * Sees if an object is equal to a specified quatrefoil.
   *
   * @param obj -- an object to check the quatrefoil values of.
   * @return -- returns true if equal to the specified quatrefoil.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Quatrefoil)) {
         return false;
      }
      else {
         Quatrefoil qf = (Quatrefoil) obj;
         return (label.equalsIgnoreCase(qf.getLabel())
            && Math.abs(diameter - qf.getDiameter()) < .000001);
      }
   }
   
   /**
   * Required by checkstyle for the equals method.
   *
   * @return -- returns 0 of type int.
   */
   public int hashCode() {
      return 0;
   }
   
}