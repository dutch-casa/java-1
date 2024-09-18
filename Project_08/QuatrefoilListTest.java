import org.junit.Assert;
import org.junit.Test;
import java.text.DecimalFormat;

/**
* Tests QuatrefoilList methods.
*
* Project_08
* @author Dutch Casadaban
* @version 3/28/2023
*/
public class QuatrefoilListTest {

   private DecimalFormat f = new DecimalFormat("#,##0.0##");


   /** A test for getName method. **/
   @Test public void getNameTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals("Test", l.getName());
   }
   
   /** A test for numberOfQuatrefoils method. **/
   @Test public void numberOfQuatrefoilsTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals(3, l.numberOfQuatrefoils());
   }
   
   /** A test for totalDiameters method. **/
   @Test public void totalDiametersTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals(153.34, l.totalDiameters(), 0.001);
   }
   /** A test for totalDiameters method. **/
   @Test public void totalDiametersTest2() {
      Quatrefoil[] emp = {};
      QuatrefoilList e = new QuatrefoilList("Empty", emp, 0);
      Assert.assertEquals(0, e.totalDiameters(), 0.001);
   }
   
   /** A test for totalPerimeters method. **/
   @Test public void totalPerimetersTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals(481.732, l.totalPerimeters(), 0.001);
   }
   
   /** A test for totalAreas method. **/
   @Test public void totalAreasTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals("8,933.417", f.format(l.totalAreas()));
   }
   
   /** A test for totalAreas method. **/
   @Test public void totalAreasTest2() {
      Quatrefoil[] emp = {};
      QuatrefoilList e = new QuatrefoilList("Empty", emp, 0);
      Assert.assertEquals(0, e.totalAreas(), 0.001);
   }
   
   /** A test for averageDiameter method. **/
   @Test public void averageDiameterTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals("51.113", f.format(l.averageDiameter()));
   }
   
   /** A test for averageDiameter method. **/
   @Test public void averageDiameterTest2() {
      Quatrefoil[] emp = {};
      QuatrefoilList e = new QuatrefoilList("Empty", emp, 0);
      Assert.assertEquals(0, e.averageDiameter(), 0.001);
   }
   
   /** A test for averagePerimeter method. **/
   @Test public void averagePerimeterTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals("160.577", f.format(l.averagePerimeter()));
   }
   
   
   /** A test for averageArea method. **/
   @Test public void averageAreaTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals("2,977.806", f.format(l.averageArea()));
   }
   
   /** A test for averageArea method. **/
   @Test public void averageAreaTest2() {
      Quatrefoil[] emp = {};
      QuatrefoilList e = new QuatrefoilList("Empty", emp, 0);
      Assert.assertEquals(0, e.averageArea(), 0.001);
   }
   
   /** A test for getList method. **/
   @Test public void getListTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertTrue(l.getList().toString().contains("Quatrefoil"));
   }
   
   /** A test for addQuatrefoil method. **/
   @Test public void addQuatrefoilTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         null};
      QuatrefoilList l = new QuatrefoilList("Test", q, 2);
      l.addQuatrefoil("Large Example", 111.4);
      
      Assert.assertEquals(3, l.numberOfQuatrefoils());
   }
   
   /** A test for deleteQuatrefoil method. **/
   @Test public void deleteQuatrefoilTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertTrue(l.deleteQuatrefoil("Large Example").toString()
         .contains("Large Example"));
   }
   
   /** A test for deleteQuatrefoil method. **/
   @Test public void deleteQuatrefoilTest2() {
      Quatrefoil[] q = {};
      QuatrefoilList l = new QuatrefoilList("Test", q, 0);
      
      Assert.assertEquals(null, l.deleteQuatrefoil("Large Example"));
   }
   
   /** A test for findQuatrefoil method. **/
   @Test public void findQuatrefoilTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertTrue(l.findQuatrefoil("Large Example").toString()
         .contains("Large Example"));
   }
   
   /** A test for findQuatrefoil method. **/
   @Test public void findQuatrefoilTest2() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals(null, l.findQuatrefoil("false"));
   }
   
   /** A test for editQuatrefoil method (true). **/
   @Test public void editQuatrefoilTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals(true, l.editQuatrefoil("Large Example", 111.4));
   }
   
   /** A test for editQuatrefoil method (false). **/
   @Test public void editQuatrefoilTest2() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertEquals(false, l.editQuatrefoil("fail", 111.4));
   }
   
   
   /** A test for findQuatrefoilWithLargestDiameter method. **/
   @Test public void findLargestTest1() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertTrue(l.findQuatrefoilWithLargestDiameter().toString()
         .contains("Large Example"));
   }
   
   /** A test for findQuatrefoilWithLargestDiameter method. **/
   @Test public void findLargestTest2() {
      Quatrefoil[] q = {};
      QuatrefoilList l = new QuatrefoilList("Test", q, 0);
      
      Assert.assertEquals(null, l.findQuatrefoilWithLargestDiameter());
   }
   
   /** A test for the toString method.*/
   @Test public void toStringTest() {
      Quatrefoil[] q = {new Quatrefoil("Small Example", 3.5),
         new Quatrefoil(" Medium Example ", 38.44),
         new Quatrefoil("Large Example", 111.4)};
      QuatrefoilList l = new QuatrefoilList("Test", q, 3);
      
      Assert.assertTrue(l.toString().contains("Test"));
   }
     
   
}
