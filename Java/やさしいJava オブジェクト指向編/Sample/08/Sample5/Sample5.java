import java.io.*;

public class Sample5
{
   public static void main(String args[])
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

      Factory f = new SimpleFactory();

      String s = f.createPage(content);
      try{
         PrintWriter pw = new PrintWriter
         (new BufferedWriter(new FileWriter("Page.html")));
         
         pw.println(s);
         System.out.println("ファイルに書きこみました。");
         pw.close();
      }
      catch(IOException e){}
   }
}
