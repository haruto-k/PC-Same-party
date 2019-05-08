import java.io.*;

public class TextReader
{
   public String getText()
   {
     String content = null;
      try{
         BufferedReader br = new BufferedReader(new FileReader("Yasacii.txt"));
         String str;
         StringBuffer sb = new StringBuffer();
         while((str = br.readLine()) != null){
            sb.append(str);
         }
         content = sb.toString();
         br.close();
      }catch(IOException e){}

      return content;
   }
}