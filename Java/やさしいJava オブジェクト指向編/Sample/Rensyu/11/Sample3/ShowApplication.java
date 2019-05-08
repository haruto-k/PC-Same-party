import java.io.*;
import java.util.*;
import java.text.*;

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
      Calendar cl = Calendar.getInstance();
      cl.setTime(new Date());
      DateFormat df = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
      System.out.println("Write:" + df.format(cl.getTime()));
   }
}
