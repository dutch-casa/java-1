import org.junit.Assert;
import org.junit.Test;

/**
* Tests to see if BankLoan.java is running properly.
*
* Project_07A
* @author Dutch Casadaban
* @version 3/13/2023
*/
public class BankLoanTest {

   /** A test for BankLoan.java. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
