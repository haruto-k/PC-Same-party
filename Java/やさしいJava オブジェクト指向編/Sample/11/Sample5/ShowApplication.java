import java.util.*;

public class ShowApplication extends Application
{
   MyApplication ma;

   public ShowApplication(MyApplication m)
   {
      super(m);
      ma = m;
   }
   public void show()
   {
      ArrayList<String> doc = ma.getDocument();
      Iterator<String> it = doc.iterator();
      while(it.hasNext()){
         String line = it.next();
         System.out.println(line);
      }
   }
}
