import java.io.*;

public class Sample8
{
   public static void main(String args[])
   {
      Factory f = new RectCalFactory();
      String s = f.createPage();
      try{
         PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter("Page.html")));
         
         pw.println(s);

         System.out.println("ファイルに書きこみました。");
         pw.close();
      }
      catch(IOException e){}
   }
}
