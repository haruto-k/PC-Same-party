import java.io.*;

class SampleP2
{
   public static void main(String[] args)throws IOException
   {
      System.out.println("�e�X�g�̓_������͂��Ă��������B�i0�ŏI���j");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      int num = 0; 
      int sum = 0;

      do{
         String str = br.readLine();
         num = Integer.parseInt(str);
         sum += num;
      }while(num != 0);

      System.out.println("�e�X�g�̍��v�_��" + sum + "�_�ł��B");
   }
}
