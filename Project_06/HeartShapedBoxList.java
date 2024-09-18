//imports
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Creates the HeartShapedBoxList object.
*
* Project_06
* @author Dutch Casadaban
* @version 2/23/2023
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
   
   
   /**
   * Returns the array list.
   *
   * @return -- returns the array list of HeartBoxes.
   */
   public ArrayList<HeartShapedBox> getList() {
      return list;
   }
   
   /**
   * Uses an array list to make a heart shaped box.
   *
   * @param fileName -- name of file to read in.
   * @return -- returns a list of box objects.
   * @throws FileNotFoundException -- catches when file is not found.
   */
   public HeartShapedBoxList readFile(String fileName)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      ArrayList<HeartShapedBox> userList = 
         new ArrayList<HeartShapedBox>();
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine().trim();
         double radiusIn = scanFile.nextDouble();
         scanFile.nextLine();
         double heightIn = scanFile.nextDouble();
         scanFile.nextLine();
         HeartShapedBox h = 
            new HeartShapedBox(labelIn, radiusIn, heightIn);
         userList.add(h);
      }
      scanFile.close();
      
      HeartShapedBoxList myList = 
         new HeartShapedBoxList(listName, userList);
      
      return myList;
   }
   
   /**
   * Adds heart shaped box to list object.
   *
   * @param labelIn -- string for HeartShapedBox.
   * @param radius -- double for radius.
   * @param height -- double for height.
   */
   public void addHeartShapedBox(String labelIn, double radius,
      double height) {
      list.add(new HeartShapedBox(labelIn, radius, height));
   }
   
   /**
   * Finds a box in the list.
   *
   * @param labelIn -- label of box to search for.
   * @return returns a certain heartshaped box, or null.
   */
   public HeartShapedBox findHeartShapedBox(String labelIn) {
      for (int i = 0; i < list.size(); i++) {
         HeartShapedBox getBox = list.get(i);
         if (getBox.getLabel().equalsIgnoreCase(labelIn)) {
            i++;
            return getBox;
         }
      }
      return null;
   }
   
   /**
   * Deletes a specified box.
   *
   * @param labelIn -- label of box to delete.
   * @return -- returns null or the object deleted.
   */
   public HeartShapedBox deleteHeartShapedBox(String labelIn) {
      for (int i = 0; i < list.size(); i++) {
         HeartShapedBox getBox = list.get(i);
         if (getBox.getLabel().equalsIgnoreCase(labelIn)) {
            list.remove(i);
            i--;
            return getBox;
         }
      }
      return null;
   }
   
   /**
   * Edits the radius and height of a specified box.
   *
   * @param labelIn -- string for HeartShapedBox.
   * @param radius -- double for radius.
   * @param height -- double for height.
   * @return -- returns a boolean value if object is found.
   */
   public boolean editHeartShapedBox(String labelIn, double radius,
      double height) {
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            list.set(i, new HeartShapedBox(list.get(i).getLabel(), 
               radius, height));
            return true;
         }
      }
      return false;
   }
}