import org.junit.Assert;
import org.junit.Test;

/**
* Tests the PremierEliteBuyer class.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/
public class PremierEliteBuyerTest {

   /** A test for the getBonusAwardPoints method. **/
   @Test public void getBonusAwardPointsTest() {
      PremierEliteBuyer peb2 = 
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      double[] peb2Purchases = {34.5, 100.0, 63.50, 300.0, 100.0};
      peb2.setPurchases(peb2Purchases);
      Assert.assertEquals(1000, peb2.getBonusAwardPoints());
   }
   
   /** A test for the setBonusAwardPoints method. **/
   @Test public void setBonusAwardPointsTest() {
      PremierEliteBuyer peb2 = 
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      double[] peb2Purchases = {34.5, 100.0, 63.50, 300.0, 100.0};
      peb2.setPurchases(peb2Purchases);
      peb2.setBonusAwardPoints(2000);
      Assert.assertEquals(2000, peb2.getBonusAwardPoints());
   }
   
   /** A test for the getBonusAwardPoints method. **/
   @Test public void calcAwardPointsTest1() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      double[] peb1Purchases = {34.5, 100.0, 63.50, 300.0};
      peb1.setPurchases(peb1Purchases);
      Assert.assertEquals(8460, peb1.calcAwardPoints());
   }
   
   /** A test for the getBonusAwardPoints method. **/
   @Test public void calcAwardPointsTest2() {
      PremierEliteBuyer peb2 = 
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      double[] peb2Purchases = {34.5, 100.0, 63.50, 300.0, 100.0};
      peb2.setPurchases(peb2Purchases);
      Assert.assertEquals(11160, peb2.calcAwardPoints());
   }
   
   /** A test for the toString method. **/
   @Test public void toStringTest1() {
      PremierEliteBuyer peb2 = 
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      double[] peb2Purchases = {34.5, 100.0, 63.50, 300.0, 100.0};
      peb2.setPurchases(peb2Purchases);
      peb2.toString();
      Assert.assertTrue(peb2.toString().contains("includes 1000 bonus"));
   }
   
   /** A test for the toString method. **/
   @Test public void toStringTest2() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      double[] peb1Purchases = {34.5, 100.0, 63.50, 300.0};
      peb1.setPurchases(peb1Purchases);
      peb1.toString();
      Assert.assertTrue(peb1.toString().contains("King, Kelly"));
   }
}
