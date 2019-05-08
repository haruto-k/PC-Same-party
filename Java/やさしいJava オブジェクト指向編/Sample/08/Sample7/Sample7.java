import java.io.*;

public class Sample7
{
   public static void main(String args[])
   {
      Factory f = new LineCalFactory();
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
