public class MyChar 
{
   private char ch;

   public MyChar(char c)
   {
      if(c>='a' && c<='z'){
         ch = c;
      }
      else{
         ch = ' ';
         System.out.println("Ý’è‚Å‚«‚Ü‚¹‚ñ‚Å‚µ‚½B");
     }
   }
   public char getChar()
   {
      return ch;
   }
}


