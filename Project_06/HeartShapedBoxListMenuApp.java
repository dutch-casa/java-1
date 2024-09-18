//imports
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
* Creates the menu for the HeartSHapedBoxList program.
*
* Project_06
* @author Dutch Casadaban
* @version 2/23/2023
*/
public class HeartShapedBoxListMenuApp {
   /**
   * Main method for the menu.
   *
   * @param args command line arguments -- not used.
   * @throws FileNotFoundException -- makes sure the file exists.
   */
   public static void main(String[] args) 
      throws FileNotFoundException {
      Scanner userInput = new  Scanner(System.in);
      char choice = 'Q';
      ArrayList<HeartShapedBox> hList =
         new ArrayList<HeartShapedBox>();
      HeartShapedBoxList heart = 
         new HeartShapedBoxList("*** no list name assigned ***", hList);
      System.out.println("HeartShapedBox List System Menu");
      System.out.println("R - Read File and Create "
         + "HeartShapedBox List");
      System.out.println("P - Print HeartShapedBox List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add HeartShapedBox");
      System.out.println("D - Delete HeartShapedBox");
      System.out.println("F - Find HeartShapedBox");
      System.out.println("E - Edit HeartShapedBox");
      System.out.println("Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
      
         choice = userInput.nextLine().toUpperCase().charAt(0);
      
         switch (choice) {
            case 'R':
               System.out.print("\tFile name: ");
               String fileName = userInput.nextLine();
               heart = heart.readFile(fileName);
               System.out.println("\tFile read in and HeartShapedBox"
                  + " List created\n");
               break;
            case 'P':
               System.out.println("\n" + heart);
               break;
            case 'S':
               System.out.println("\n" + heart.summaryInfo() + "\n");
               break;
            case 'A':
               System.out.print("\tLabel: ");
               String labelIn = userInput.nextLine();
               System.out.print("\tRadius: ");
               double radiusIn = userInput.nextDouble();
               System.out.print("\tHeight: ");
               double heightIn = userInput.nextDouble();
               heart.addHeartShapedBox(labelIn, radiusIn, heightIn);
               userInput.nextLine();
               System.out.println("\t*** HeartShapedBox added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               String delLabel = userInput.nextLine();
               if (heart.deleteHeartShapedBox(delLabel) != null) {
                  heart.deleteHeartShapedBox(delLabel);
                  System.out.println("\t\"" + delLabel + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + delLabel + "\" not found\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               String fLabel = userInput.nextLine();
               if (heart.findHeartShapedBox(fLabel) != null) {
                  System.out.println(heart.findHeartShapedBox(fLabel) + "\n");
               }
               else {
                  System.out.println("\t\"" + fLabel + "\" not found\n");
               }
               break;
            case 'E':
               System.out.print("\tLabel: ");
               String eLabel = userInput.nextLine();
               System.out.print("\tRadius: ");
               double eRadius = userInput.nextDouble();
               System.out.print("\tHeight: ");
               double eHeight = userInput.nextDouble();
               userInput.nextLine();
               if (heart.editHeartShapedBox(eLabel, eRadius, eHeight)) {
                  heart.editHeartShapedBox(eLabel, eRadius, eHeight);
                  System.out.print("\t\""
                     + heart.findHeartShapedBox(eLabel).getLabel()
                     + "\" successfully edited\n\n");
               }
               else {
                  System.out.println("\t\"" + eLabel + "\" not found\n");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (choice != 'Q');
   }
}