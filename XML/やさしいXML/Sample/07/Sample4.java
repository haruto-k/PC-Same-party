import java.io.*;

class Sample4
{
   public static void main(String args[]) throws Exception
   {
      PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter("Sample.txt")));

      String str = "こんにちは";
      pw.println(str);

      int len = str.length();
      pw.println(str + "の長さは" + len + "です。");

      pw.close();
   }
}
