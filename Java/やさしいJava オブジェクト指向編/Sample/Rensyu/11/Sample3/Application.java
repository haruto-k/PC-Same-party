import java.io.*;

public class Application
{
   private MyApplication ma;

   public Application(MyApplication m)
   {
      ma = m;
   }
   public void open(String filename)
   {
      ma.open(filename);
   }
   public void save(String filename)
   {
      ma.save(filename);
   }
}
