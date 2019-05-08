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
         System.out.println("Ý’è‚Å‚«‚Ü‚¹‚ñ‚Å‚µ‚½B");
      }
   }
   public void setNum(int n)
   {
      if(n>=0 && n<=1000){
         num = n;
      }
      else{
         num = 0;
         System.out.println("Ý’è‚Å‚«‚Ü‚¹‚ñ‚Å‚µ‚½B");
      }
   }
   public int getNum()
   {
      return num;
   }
}

