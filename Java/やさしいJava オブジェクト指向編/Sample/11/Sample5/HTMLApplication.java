import java.io.*;
import java.util.*;

public class HTMLApplication extends MyApplication
{
   public void save(String filename)
   {
      try{
         PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter(filename)));

         Iterator<String> it = doc.iterator();
         pw.println("<html><title>");
         pw.println(filename);
         pw.println("</title><body>");
         pw.println("<h1>");
         pw.println(filename);
         pw.println("</h1>");
         while(it.hasNext()){
            String line = it.next();
            pw.println(line);
            pw.println("<br>");
         }
         pw.println("</body></html>");
         pw.close();
      }
      catch(IOException e){}
   }
}
