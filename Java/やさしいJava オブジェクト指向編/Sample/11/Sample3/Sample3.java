import java.io.*;

public class Sample3
{
   public static void main(String args[])
   {
      Application ap = new HTMLApplication();
      ap.open(args[0]);
      ap.save(args[1]);
      System.out.println(args[1] + "�ɏo�͂��܂����B");
   }
}
