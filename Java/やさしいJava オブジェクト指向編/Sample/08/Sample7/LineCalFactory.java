import java.util.*;

public class LineCalFactory implements Factory
{
   private Calendar cl;

   public String createPage()
   {
      StringBuffer sb = new StringBuffer();
      cl = Calendar.getInstance();
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
      sb.append("カレンダー（リスト）");
      sb.append("</title></head>");
      return sb.toString();
   }
   public String createTitle()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<h1>");
      sb.append(cl.get(Calendar.MONTH)+1);
      sb.append("月");
      sb.append("</h1>");
      return sb.toString();
   }
   public String createBody()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<body>");
      sb.append(createTitle());
      sb.append("<table border=\"1\">");
      sb.append(createCal());
      sb.append("</table>");
      sb.append("</body>");
      return sb.toString();
   }
   public String createCal()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<tr height=\"100\">");

      cl.add(Calendar.DAY_OF_MONTH,(-cl.get(Calendar.DAY_OF_MONTH)+1));

      for(int i=1;i<=cl.getActualMaximum(Calendar.DAY_OF_MONTH);i++){
        sb.append(createList(i));
      }      
      sb.append("</tr>");
      return sb.toString();
   }      
   public String createList(int i)
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<tr>");
      if(i%2==0){
         sb.append("<td width=\"600\" bgcolor=\"#FFDDDD\">");
      }
      else{
          sb.append("<td width=\"600\">");
      }
      sb.append(new Integer(i).toString());
      sb.append("</td>");
      sb.append("</tr>");
      return sb.toString();
   }
}
