import java.io.*;

class SampleP5
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("���т���͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      switch(res){
         case 1:
            System.out.println("�����Ƃ���΂�܂��傤�B");
            break;
         case 2:
            System.out.println("������������΂�܂��傤�B");
            break;
         case 3:
            System.out.println("����ɏ���߂����܂��傤�B");
            break;
         case 4:
            System.out.println("�����ւ�悭�ł��܂����B");
            break;
         case 5:
            System.out.println("�����ւ�D�G�ł��B");
            break;
      }
   }
}
