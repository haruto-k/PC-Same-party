public class Book
{
   private String title;
   private String isbn;

   public Book(String t, String i)
   {
      title = t;
      isbn = i;
   }
   public void setTitle(String t)
   {
      title = t;
   }
   public String getTitle()
   {
      return title;
   }
   public String getISBN()
   {
      return isbn;
   }
}
