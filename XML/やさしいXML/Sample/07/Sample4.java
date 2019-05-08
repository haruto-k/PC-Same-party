import java.io.*;

class Sample4
{
   public static void main(String args[]) throws Exception
   {
      PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter("Sample.txt")));

      String str = "Ç±ÇÒÇ…ÇøÇÕ";
      pw.println(str);

      int len = str.length();
      pw.println(str + "ÇÃí∑Ç≥ÇÕ" + len + "Ç≈Ç∑ÅB");

      pw.close();
   }
}
