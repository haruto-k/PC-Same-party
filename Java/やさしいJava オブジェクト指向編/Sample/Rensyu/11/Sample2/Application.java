import java.io.*;
import java.util.*;

public abstract class Application
{
   protected ArrayList<String> doc = new ArrayList<String>();

   public void open(String filename)
   {
      try{
         BufferedReader br = new BufferedReader(new FileReader(filename));
         String line = null;
         while((line = br.readLine()) != null){
            doc.add(line);
         }
         br.close();
      }
      catch(IOException e){}
   }
   public abstract void save(String filename);
}
