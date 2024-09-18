/**
* Extends the OnlineTextItem class for a book.
*
* Activity_10
* @author Dutch Casadaban
* @version 4/10/2023
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;
   /**
   * Constructor class for OnlineBook.
   *
   * @param nameIn - passes name in.
   * @param priceIn - passes price in.
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
   * Return string representation of OnlineBook.
   *
   * @return -- string representation of OnlineBook.
   */
   public String toString() {
      return name + " - " + author + ": $" + price; 
   }
   
   /**
   * Sets the author's name.
   *
   * @param authorIn -- the name of the author to set to the book.
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}