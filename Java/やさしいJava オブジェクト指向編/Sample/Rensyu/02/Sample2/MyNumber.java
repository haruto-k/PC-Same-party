public class MyNumber
{
   private int num;

   public MyNumber(int n)
   {
      if(n>=0 && n<=1000)
      {
         num = n;
      }
      else{
         num = 0;
         System.out.println("�ݒ�ł��܂���ł����B");
      }
   }
   public void setNum(int n)
   {
      if(n>=0 && n<=1000){
         num = n;
      }
      else{
         num = 0;
         System.out.println("�ݒ�ł��܂���ł����B");
      }
   }
   public int getNum()
   {
      return num;
   }
}

