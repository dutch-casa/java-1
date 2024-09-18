/**
* Creates the UserInfo object.
*
* Activity_04
* @author Dutch Casadaban
* @version 2/07/2023
*/
public class UserInfo {
   /**
   * Declares variables, constructors and methods for the driver class.
   * 
   * @param args Command line args -- not used.
   */
   // instance variables
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;
   // constructor
   /**
   * Creates UserInfo object initial vars.
   *
   * @param firstNameIn Gets user input and sets that to be the firstName.
   * @param lastNameIn Gets user input and sets that to be the lastName.
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   /**
   * Prints the UserInfo objects to the output line.
   * 
   * @return output -- outputs the variables of UserInfo.
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   } 
   /**
   * Gets user input and sets location.
   * 
   * @param locationIn -- sets UserInfo location.
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   * Sets the UserInfo Age.
   *
   * @param ageIn -- sets UserInfo age
   * @return isSet -- returns boolean; checks if the age has already been set.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   * Returns set age value.
   *
   * @return age -- returns age
   */
   public int getAge() {
      return age;
   }
   /**
   * Returns set location.
   *
   * @return location -- returns location
   */
   public String getLocation() {
      return location;
   }
   /**
   * Sets user status to offline.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   * Sets user status to online.
   */
   public void logOn() {
      status = ONLINE;
   }
}