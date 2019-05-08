import java.io.*;

public class Sample2
{
   public static void main(String args[])
   {
      Application ap = new TextApplication();
      ap.open(args[0]);
      ap.save(args[1]);
      System.out.println(args[1] + "Ç…èoóÕÇµÇ‹ÇµÇΩÅB");
   }
}
