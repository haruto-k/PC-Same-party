import java.io.*;

class Sample4
{
   public static void main(String args[]) throws Exception
   {
      PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter("Sample.txt")));

      String str = "����ɂ���";
      pw.println(str);

      int len = str.length();
      pw.println(str + "�̒�����" + len + "�ł��B");

      pw.close();
   }
}
