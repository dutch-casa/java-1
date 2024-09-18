import org.junit.Assert;
import org.junit.Test;

/**
* Tests the EliteBuyer class.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/
public class EliteBuyerTest {
   
   /** A test for the getAcctNumber method. **/
   @Test public void getAcctNumberTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      Assert.assertEquals("10002", eb.getAcctNumber());
   }
   
   /** A test for the setAcctNumber method. **/
   @Test public void setAcctNumberTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      eb.setAcctNumber("10045");
      Assert.assertEquals("10045", eb.getAcctNumber());
   }
   
   /** A test for the getName method. **/
   @Test public void getName() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      Assert.assertEquals("Jones, Pat", eb.getName());
   }
   
   /** A test for the setName method. **/
   @Test public void setName() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      eb.setName("McCartney, Paul");
      Assert.assertEquals("McCartney, Paul", eb.getName());
   }
   
   /** A test for the getDiscountRate method. **/
   @Test public void getDiscountRateTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      Assert.assertEquals(0.05, eb.getDiscountRate(), 2);
   }
   
   /** A test for the setDiscountRate method. **/
   @Test public void setDiscountRateTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      eb.setDiscountRate(0.45);
      Assert.assertEquals(0.45, eb.getDiscountRate(), 2);
   }
   
   /** A test for the calcAwardPoints method. **/
   @Test public void calcAwardPointsTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      Assert.assertEquals(4730, eb.calcAwardPoints());
   }
   
   /** A test for the calcSubtotal method. **/
   @Test public void calcSubtotalTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      Assert.assertEquals(473.10, eb.calcSubtotal(), 2);
   }
   
   /** A test for the toString method. **/
   @Test public void toStringTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      double[] ebPurchases = {34.5, 100.0, 63.50, 300.0};
      eb.setPurchases(ebPurchases);
      Assert.assertTrue(eb.toString().contains("Jones"));
   }
}
