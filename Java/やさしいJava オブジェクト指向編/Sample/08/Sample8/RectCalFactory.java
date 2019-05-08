import java.util.*;

public class RectCalFactory implements Factory
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
      sb.append("カレンダー（項目）");
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
      sb.append("<table border=\"2\">");
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

      int i;
      for(i=1; i<cl.get(Calendar.DAY_OF_WEEK); i++){
            sb.append(createEmptyItem());
      }

      for(int j=1; j<=cl.getActualMaximum(Calendar.DAY_OF_MONTH); j++){
          sb.append(createItem(j)); 
         if((j+i-1)%7 == 0){
            sb.append("</tr>");
            sb.append("<tr height=\"100\">");
         }
      }
      sb.append("</tr>");
      return sb.toString();
   }
   public String createEmptyItem()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<td  width=\"100\">");
      sb.append("</td>");
      return sb.toString();
   }
   public String createItem(int i)
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<td width=\"100\">");
      sb.append(new Integer(i).toString());
      sb.append("</td>");
      return sb.toString();
   }
}