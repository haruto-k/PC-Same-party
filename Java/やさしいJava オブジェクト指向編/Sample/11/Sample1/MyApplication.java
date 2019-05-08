import java.io.*;
import java.util.*;

class MyApplication implements Application
{
   private ArrayList<String> doc = new ArrayList<String>();

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
