import java.io.*;

class SampleP3
{
   public static void main(String[] args)
   {
      if(args.length != 1){
         System.out.println("�t�@�C�����𐳂����w�肵�Ă��������B");
         System.exit(1);
      }

      try{
         PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter(args[0])));
         
         pw.println("A long time ago,");
         pw.println("There was a little girl.");

         pw.close();
      }
      catch(IOException e){
         System.out.println("���o�̓G���[�ł��B");
      }
   }
}