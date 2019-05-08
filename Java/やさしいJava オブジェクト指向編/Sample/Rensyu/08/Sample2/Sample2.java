import java.io.*;

public class Sample2
{
   public static void main(String args[])
   {

      File fl = new File("c:\\");

      Factory f1 = new SimpleFactory();
      Factory f2 = new DetailFactory();
      String s1 = f1.createPage(fl);
      String s2 = f2.createPage(fl);
      try{
         PrintWriter pw1 = new PrintWriter
         (new BufferedWriter(new FileWriter("Page1.html")));
         
         PrintWriter pw2 = new PrintWriter
         (new BufferedWriter(new FileWriter("Page2.html")));

         pw1.println(s1);
         pw2.println(s2);

         System.out.println("ファイルに書きこみました。");
         pw1.close();
         pw2.close();
      }
      catch(IOException e){}
   }
}
