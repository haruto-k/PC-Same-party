import java.io.*;

class SampleP4
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("�~�����̒l�͂����ł����H");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine();

      double pi = Double.parseDouble(str);

      System.out.println("�~�����̒l��" + pi + "�ł��B");
   }
}
