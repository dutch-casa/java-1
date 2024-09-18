import org.junit.Assert;
import org.junit.Test;
import java.text.DecimalFormat;

/**
* Tests to see if Quatrefoil.java is running properly.
*
* Project_07B
* @author Dutch Casadaban
* @version 3/23/2023
*/
public class QuatrefoilTest {
   
   private DecimalFormat f = new DecimalFormat("#,##0.0##");

   /** Tests the getLabel method. **/
   @Test public void getLabelTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("Medium Example", ex2.getLabel());
   }
   
   /** Tests the setLabel method. **/
   @Test public void setLabelTest1() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      
      Assert.assertEquals(true, ex2.setLabel("new name"));
   }
   
   /** Tests the setLabel method. **/
   @Test public void setLabelTest2() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      
      Assert.assertEquals(false, ex2.setLabel(null));
   }
   
   /** Tests the getDiameter method. **/
   @Test public void getDiameterTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("38.44", f.format(ex2.getDiameter()));
   }
   
   /** Tests the setDiameter method. **/
   @Test public void setDiameterTest1() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(true, ex2.setDiameter(22.22));
   }
   
   /** Tests the setDiameter method. **/
   @Test public void setDiameterTest2() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(false, ex2.setDiameter(0));
   }
   
   /** Tests the perimeter method. **/
   @Test public void perimeterTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("120.763", f.format(ex2.perimeter()));
   }
   
   /** Tests the perimeterInFt method. **/
   @Test public void perimeterInFtTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals("10.064", f.format(ex2.perimeterInFt()));
   }
   
   /** Tests the area method. **/
   @Test public void areaTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      
      Assert.assertEquals("949.674", f.format(ex2.area()));
   }
   
   /** Tests the areaInSqFt method. **/
   @Test public void areaInSqFtTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);

      Assert.assertEquals("6.595", f.format(ex2.areaInSqFt()));
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
   @Test public void equalsTest1() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(true, ex2.equals(ex2));
   }
   
   /** Tests the equals method. **/
   @Test public void equalsTest2() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      
      Assert.assertEquals(false, ex2.equals(ex1));
   }
   
   /** Tests the equals method. **/
   @Test public void equalsTest3() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      String testObj = "";
      Assert.assertEquals(false, ex2.equals(testObj));
   }
   
   /** Tests the hashCode method. **/
   @Test public void hashCodeTest() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      
      Assert.assertEquals(0, ex2.hashCode());
   }
   
   /** Tests the compareTo method. **/
   @Test public void compareToTest1() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      
      
      Assert.assertEquals(-1, ex1.compareTo(ex2));
   }
   
   /** Tests the compareTo method. **/
   @Test public void compareToTest2() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      
      
      Assert.assertEquals(1, ex2.compareTo(ex1));
   }
   
   /** Tests the compareTo method. **/
   @Test public void compareToTest3() {
      Quatrefoil ex2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil test = new Quatrefoil("Test ", 38.44);
      
      
      Assert.assertEquals(0, test.compareTo(ex2));
   }
   
}
