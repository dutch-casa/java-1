/**
* Extends the OnlineTextItem class so we can instansiate.
*
* Activity_09
* @author Dutch Casadaban
* @version 4/03/2023
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
   * Constructor class for OnlineArticle.
   *
   * @param nameIn - passes name in.
   * @param priceIn - passes price in.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
   * Mutator method for the wordCount.
   *
   * @param wordCountIn -- what to set the word count to.
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}