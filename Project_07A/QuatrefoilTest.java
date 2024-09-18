import org.junit.Assert;
import org.junit.Test;
import java.text.DecimalFormat;

/**
* Tests to see if Quatrefoil.java is running properly.
*
* Project_07A
* @author Dutch Casadaban
* @version 3/15/2023
*/
public class QuatrefoilTest {

   private DecimalFormat formatter = new DecimalFormat("#,##0.0##");

   /** Tests the getLabel method. **/
   @Test public void getLabelTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("Medium Example", ex2.getLabel());
   }
   
   /** Tests the setLabel method. **/
   @Test public void setLabelTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      ex2.setLabel("new name");
      Assert.assertEquals("new name", ex2.getLabel());
   }
   
   /** Tests the getDiameter method. **/
   @Test public void getDiameterTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("38.44", formatter.format(ex2.getDiameter()));
   }
   
   /** Tests the setDiameter method. **/
   @Test public void setDiameterTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      ex2.setDiameter(22.22);
      Assert.assertEquals("22.22", formatter.format(ex2.getDiameter()));
   }
   
   /** Tests the perimeter method. **/
   @Test public void perimeterTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("120.763", formatter.format(ex2.perimeter()));
   }
   
   /** Tests the perimeterInFt method. **/
   @Test public void perimeterInFtTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("10.064", formatter.format(ex2.perimeterInFt()));
   }
   
   /** Tests the area method. **/
   @Test public void areaTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      
      Assert.assertEquals("949.674", formatter.format(ex2.area()));
   }
   
   /** Tests the areaInSqFt method. **/
   @Test public void areaInSqFtTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);

      Assert.assertEquals("6.595", formatter.format(ex2.areaInSqFt()));
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertTrue(ex2.toString().contains("Medium Example"));
   }
   
   /** Tests the resetCount method. **/
   @Test public void resetCountTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      ex2.resetCount();
      
      Assert.assertEquals(0, ex2.getCount());
   }
   
   /** Tests the getCount method. **/
   @Test public void getCountTest() {
      Quatrefoil.resetCount();
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(1, ex2.getCount());
   }
   
   
   /** Tests the equals method. **/
   @Test public void equalsTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(true, ex2.equals(ex2));
   }
   
   /** Tests the hashCode method. **/
   @Test public void hashCodeTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(0, ex2.hashCode());
   }
}
