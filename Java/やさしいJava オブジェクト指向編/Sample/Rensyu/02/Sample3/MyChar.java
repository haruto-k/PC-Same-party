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
         System.out.println("�ݒ�ł��܂���ł����B");
     }
   }
   public char getChar()
   {
      return ch;
   }
}


