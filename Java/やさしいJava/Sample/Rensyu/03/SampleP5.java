import java.io.*;

class SampleP5
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("�g���Ƒ̏d����͂��Ă��������B");

      BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
      
      String str1 = br.readLine();
      String str2 = br.readLine();

      double num1 = Double.parseDouble(str1);
      double num2 = Double.parseDouble(str2);

      System.out.println("�g����" + num1 + "�Z���`�ł��B");
      System.out.println("�̏d��" + num2 + "�L���ł��B");
   }
}
