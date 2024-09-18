//imports
import java.text.DecimalFormat;

/**
* Creates the heart shaped box object.
*
* Project_05
* @author Dutch Casadaban
* @version 2/08/2023
*/

public class HeartShapedBox {
   //instance variables
   private String label = "";
   private double radius = 0.0;
   private double height = 0.0;
   
   
   //constructor
   /**
   * Constructs the vars of HeartShapedBox object.
   *
   * @param labelIn -- puts a string assigned to the object
   * @param radiusIn -- allows for an input to set the radius
   * @param heightIn -- allows for an input to set the height
   */
   public HeartShapedBox(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   
   //methods
   /**
   * Puts the object data into a formatted string to print out.
   *
   * @return -- returns the formatted data from the object.
   */
   public String toString() {
      DecimalFormat formatter = new DecimalFormat("#,##0.0##");
      String output = "HeartShapedBox \""
         + label + "\" with radius " + radius + " units and "
         + "height " + height + " units:";
      output += "\n\theart shaped area = "
         + formatter.format(heartShapedArea()) + " square units";
      output += "\n\tlateral surface area = "
         + formatter.format(lateralSurfaceArea()) + " square units";
      output += "\n\ttotal surface area = "
         + formatter.format(totalSurfaceArea()) + " square units";
      output += "\n\tvolume = "
         + formatter.format(volume()) + " cubic units";
      return output;
   }
   
   /**
   * Returns the label.
   *
   * @return -- returns the label for the HeartShapedBox.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * Sees if label is null, trims label, and returns boolean to see if set.
   *
   * @return -- returns the trimmed label.
   * @param labelIn -- The input label to trim and check.
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * Returns the radius.
   *
   * @return -- returns the radius to the object.
   */
   public double getRadius() {
      return radius;
   }
   
   /**
   * Checks the radius is greater than zero and returns a boolean to check.
   *
   * @return -- a boolean seeing if the radius has been set.
   * @param radiusIn -- input radius to check value of.
   */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }   
   
   /**
   * Puts the object data into a formatted string to print out.
   *
   * @return -- returns the height to the object.
   */
   public double getHeight() {
      return height;
   }
   
   /**
   * Checks the height is greater than zero and returns a boolean to check.
   *
   * @return -- a boolean seeing if the height has been set.
   * @param heightIn -- the height value to check the value of.
   */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
      return isSet;
   }  
   
   /**
   * Calculates the heart area.
   *
   * @return -- a double of the hearts area.
   */
   public double heartShapedArea() {
      double heartShapedArea = Math.PI * Math.pow(radius, 2)
         + 4 * Math.pow(radius, 2);
      return heartShapedArea;
   }
   
   /**
   * Calculates the lateral area.
   *
   * @return -- a double of the lateral surface area.
   */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = height * ((4 * radius)
         + (2 * Math.PI * radius));
      return lateralSurfaceArea;
   }
   
   /**
   * Calculates the total surface area.
   *
   * @return -- a double of the total surface area.
   */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 2 * (Math.PI * Math.pow(radius, 2)
         + 4 * Math.pow(radius, 2)) + (height * ((4 * radius)
         + (2 * Math.PI * radius)));
      return totalSurfaceArea;
   }
   
   /**
   * Calculates the volume.
   *
   * @return -- a double of the volume.
   */
   public double volume() {
      double volume = (Math.PI * Math.pow(radius, 2)
         + 4 * Math.pow(radius, 2)) * height;
      return volume;
   }
}