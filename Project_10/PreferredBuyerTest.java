import org.junit.Assert;
import org.junit.Test;

/**
* Tests the PreferredBuyer class.
*
* Project_10
* @author Dutch Casadaban
* @version 4/19/2023
*/
public class PreferredBuyerTest {

   /** A test for the calcAwardPoints method. **/
   @Test public void calcAwardPointsTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] pbPurchases = {34.5, 100.0, 63.50, 350.0};
      pb.setPurchases(pbPurchases);
      Assert.assertEquals(548, pb.calcAwardPoints());
   }
   
   /** A test for the getPurchases method. **/
   @Test public void getPurchasesTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] pbPurchases = {34.5, 100.0, 63.50, 350.0};
      pb.setPurchases(pbPurchases);
      Assert.assertEquals(pbPurchases, pb.getPurchases());
   }
   
   /** A test for the addPurchases method. **/
   @Test public void addPurchasesTest1() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] pbPurchases = {34.5, 100.0, 63.50, 350.0};
      pb.setPurchases(pbPurchases);
      pb.addPurchases(12.0);
      double[] expected = pb.getPurchases();
      Assert.assertEquals("Purchases not added", expected,
         pb.getPurchases());
   }
   
   /** A test for the addPurchases method. **/
   @Test public void addPurchasesTest2() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] pbPurchases = {34.5, 100.0, 63.50, 0.0};
      pb.setPurchases(pbPurchases);
      pb.addPurchases(4.5);
      double[] expected = pb.getPurchases();
      Assert.assertEquals("Purchases not added", expected,
         pb.getPurchases());
   }
   
   /** A test for the deletePurchases method. **/
   @Test public void deletePurchasesTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] pbPurchases = {34.5, 100.0, 63.50, 350.0};
      pb.setPurchases(pbPurchases);
      pb.deletePurchases(63.50, 350.0);
      double[] expected = pb.getPurchases();
      Assert.assertEquals("Purchases not added", expected,
         pb.getPurchases());
   }
   
   /** A test for the toString method. **/
   @Test public void toStringTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      double[] pbPurchases = {34.5, 100.0, 63.50, 350.0};
      pb.setPurchases(pbPurchases);
      Assert.assertTrue(pb.toString().contains("Sam"));
   }
   
   
   
}
