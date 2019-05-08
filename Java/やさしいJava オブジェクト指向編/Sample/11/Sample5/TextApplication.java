import java.io.*;
import java.util.*;

public class TextApplication extends MyApplication
{
   public void save(String filename)
   {
      try{
         PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter(filename)));
         
         Iterator<String> it = doc.iterator();
         while(it.hasNext()){
            String line = it.next();
            pw.println(line);
         }
         pw.close();
      }
      catch(IOException e){}
   }
}
