public class Sample1
{
   public static void main(String args[])
   {
      Book b = new Book("やさしいプログラミング", "1234");
      System.out.println(b.getTitle());
      System.out.println(b.getISBN());
   }
}
