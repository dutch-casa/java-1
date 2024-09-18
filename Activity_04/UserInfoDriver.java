/**
* Drives/sets variables for UserInfo objects.
*
* Activity_04
* @author Dutch Casadaban
* @version 2/07/2023
*/
public class UserInfoDriver {
   /**
   * Declares variables, constructors and methods for the driver class.
   * 
   * @param args Command line args -- not used.
   */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}