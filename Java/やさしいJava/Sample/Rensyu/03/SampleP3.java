import java.io.*;

class SampleP3
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("���Ȃ��͉��΂ł����H");

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();

      int num = Integer.parseInt(str);

      System.out.println("���Ȃ���" + num + "�΂ł��B");
   }
}
