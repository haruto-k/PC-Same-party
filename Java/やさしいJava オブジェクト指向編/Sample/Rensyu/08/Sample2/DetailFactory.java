import java.io.*;
import java.util.*;
import java.text.*;

class DetailFactory implements Factory
{
   File fl;
   public String createPage(File f)
   {
      fl = f;
      StringBuffer sb = new StringBuffer();
      sb.append("<html>");
      sb.append(createHeader());
      sb.append(createBody());
      sb.append("</html>");
      return sb.toString();
   }
   public String createHeader()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<head><title>");
      sb.append("ファイル（詳細）");
      sb.append("</title></head>");
      return sb.toString();
   }
   public String createTitle()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<h1>");
      sb.append(fl.getPath());
      sb.append("</h1>");
      return sb.toString();
   }
   public String createBody()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<body>");
      sb.append(createTitle());
      sb.append("<table border=\"1\">");
      sb.append(createFileList());
      sb.append("</table>");
      sb.append("</body>");
      return sb.toString();
   }
   public String createFileList()
   {
      StringBuffer sb = new StringBuffer();
      File[] list = fl.listFiles(new ImageFileFilter());
      for(int i=0; i<list.length; i++){
         File f = list[i];
         sb.append(createItem(f)); 
     }
      return sb.toString();
   }
   public String createItem(File f)
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<tr>");
      sb.append("<td width=\"100\" height=\"100\">");
      sb.append("<img src=\"");
      sb.append(f.getAbsolutePath());
    
      sb.append("\">");
      sb.append("</td>");
      sb.append("<td>");
      sb.append(f.getName());
      sb.append("</td>");
      sb.append("<td>");
      sb.append(f.length());
      sb.append("byte");
      sb.append("</td>");
      sb.append("<td>");
      SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/DD HH:mm:ss");
      Date d = new Date(f.lastModified());
      sb.append(df.format(d));
      sb.append("</td>");
      sb.append("</tr>");
      return sb.toString();
   }
}
