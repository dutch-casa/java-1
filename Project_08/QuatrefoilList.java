import java.text.DecimalFormat;
/**
* Creates a list populated with Quatrefoils.
*
* Project_08
* @author Dutch Casadaban
* @version 3/28/2023
*/
public class QuatrefoilList {
   private String label = "";
   private Quatrefoil[] qList;
   private int qCount = 0;
   
   /**
   * Constructor class for QuatrefoilList.
   *
   * @param labelIn -- passes label in.
   * @param listIn -- passes list in.
   * @param countIn -- passes count in.
   */
   public QuatrefoilList(String labelIn, Quatrefoil[] listIn, int countIn) {
      label = labelIn;
      qList = listIn;
      qCount = countIn;
   }
   
   /**
   * Retuns the name of the list.
   *
   * @return -- returns the list name.
   */
   public String getName() {
      return label;
   }
   
   /**
   * Retuns the count of the list.
   *
   * @return -- returns the list name.
   */
   public int numberOfQuatrefoils() {
      return qCount;
   }
   
   /**
   * Retuns total diameter in inches of all quatrefoils in list.
   *
   * @return -- returns total diameter in inches.
   */
   public double totalDiameters() {
      double totalDiameter = 0.0;
      if (qCount == 0) {
         return totalDiameter;
      }
      for (int i = 0; i < qCount; i++) {
         totalDiameter += qList[i].getDiameter();
      }
      return totalDiameter;
   }
   
   /**
   * Retuns total perimeter in inches of all quatrefoils in list.
   *
   * @return -- returns total perimeter in inches.
   */
   public double totalPerimeters() {
      double totalPerimeter = 0.0;
      if (qCount == 0) {
         return totalPerimeter;
      }
      for (int i = 0; i < qCount; i++) {
         totalPerimeter += qList[i].perimeter();
      }
      return totalPerimeter;
   }
   
   /**
   * Retuns total area in inches of all quatrefoils in list.
   *
   * @return -- returns total area in inches.
   */
   public double totalAreas() {
      double totalArea = 0.0;
      if (qCount == 0) {
         return totalArea;
      }
      for (int i = 0; i < qCount; i++) {
         totalArea += qList[i].area();
      }
      return totalArea;
   }
   
   /**
   * Retuns avg. diameter in inches of all quatrefoils in list.
   *
   * @return -- returns avg. diameter in inches.
   */
   public double averageDiameter() {
      double avgDiameter = 0.0;
      if (qCount == 0) {
         return avgDiameter;
      }
      for (int i = 0; i < qCount; i++) {
         avgDiameter += qList[i].getDiameter();
      }
      avgDiameter = Double.valueOf(avgDiameter) 
         / Double.valueOf(qList.length);
      
      return avgDiameter;
   }
   
   /**
   * Retuns avg. perimeter in inches of all quatrefoils in list.
   *
   * @return -- returns avg. perimeter in inches.
   */
   public double averagePerimeter() {
      double avgPerimeter = 0.0;
      if (qCount == 0) {
         return avgPerimeter;
      }
      for (int i = 0; i < qCount; i++) {
         avgPerimeter += qList[i].perimeter();
      }
      avgPerimeter = Double.valueOf(avgPerimeter) 
         / Double.valueOf(qList.length);
      
      return avgPerimeter;
   }
   
   /**
   * Retuns avg. perimeter in inches of all quatrefoils in list.
   *
   * @return -- returns avg. perimeter in inches.
   */
   public double averageArea() {
      double avgArea = 0.0;
      if (qCount == 0) {
         return avgArea;
      }
      for (int i = 0; i < qCount; i++) {
         avgArea += qList[i].area();
      }
      avgArea = Double.valueOf(avgArea) 
         / Double.valueOf(qList.length);
      
      return avgArea;
   }
   
   /**
   * Retuns formatted output for the string.
   *
   * @return -- returns formatted info about the Quatrefoil List.
   */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + label + " -----";
      result += "\nNumber of Quatrefoils: "
         + numberOfQuatrefoils();
      result += "\nTotal Diameters: "
         + f.format(totalDiameters()) + " inches";
      result += "\nTotal Perimeters: "
         + f.format(totalPerimeters()) + " inches";
      result += "\nTotal Areas: "
         + f.format(totalAreas()) + " square inches";
      result += "\nAverage Diameter: "
         + f.format(averageDiameter()) + " inches";
      result += "\nAverage Perimeter: "
         + f.format(averagePerimeter()) + " inches";
      result += "\nAverage Area: "
         + f.format(averageArea()) + " square inches";
      return result;
   }
   
   /**
   * Returns the quatrefoil array.
   *
   * @return -- returns the quatrefoil array.
   */
   public Quatrefoil[] getList() {
      return qList;
   }
   
   /**
   * Adds a quatrefoil to the list.
   *
   * @param labelIn -- name of the new Quatrefoil.
   * @param diameterIn -- diameter of the new Quatrefoil.
   */
   public void addQuatrefoil(String labelIn, double diameterIn) {
      Quatrefoil q = new Quatrefoil(labelIn, diameterIn);
      qList[qCount] = q;
      qCount++;
   }
   
   
   /**
   * Finds and returns a quatrefoil based on label.
   *
   * @param labelIn -- the name to find.
   * @return -- null or the quatrefoil that was found.
   */
   public Quatrefoil findQuatrefoil(String labelIn) {
      for (int i = 0; i < qCount; i++) {
         if (qList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return qList[i];
         }
      }
      return null;
   }
   
   /**
   * Finds and deletes a quatrefoil based on label.
   *
   * @param labelIn -- the name of the quatrefoil to delete.
   * @return -- null or the quatrefoil that was deleted.
   */
   public Quatrefoil deleteQuatrefoil(String labelIn) {
      for (int i = 0; i < qCount; i++) {
         if (qList[i].getLabel().equalsIgnoreCase(labelIn)) {
            Quatrefoil output = qList[i];
            for (int j = i; j < qCount - 1; j++) {
               qList[j] = qList[j + 1];
            }
            qList[qCount - 1] = null;
            qCount--;
            return output;
         }
      }
      return null;
   }
   
   /**
   * Finds and edits a quatrefoil based on label.
   *
   * @param labelIn -- the name of the quatrefoil to edit.
   * @param newDiameter -- the new diameter to edit the quatrefoil to.
   * @return -- true or false if the quatrefoil was editted.
   */
   public boolean editQuatrefoil(String labelIn, double newDiameter) {
      for (int i = 0; i < qCount; i++) {
         if (qList[i].getLabel().equalsIgnoreCase(labelIn)) {
            qList[i].setDiameter(newDiameter);
            return true;
         }
      }
      return false;
   }
   
   /**
   * Finds the quatrefoil with the largest diameter.
   *
   * @return -- returns the quatrefoil with the largest diameter.
   */
   public Quatrefoil findQuatrefoilWithLargestDiameter() {
      double largest = 0.0;
      int i = 0;
      Quatrefoil largestQuatrefoil = null;
      
      if (qList.length == 0) {
         return null;
      }
    
      while (i < qCount) {
         if (largest < qList[i].getDiameter()) {
            largest = qList[i].getDiameter();
            largestQuatrefoil = qList[i];
         }
         i++;
      }
      return largestQuatrefoil;
   }
}