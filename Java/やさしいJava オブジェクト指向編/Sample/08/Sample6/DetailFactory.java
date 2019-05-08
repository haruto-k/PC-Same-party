public class DetailFactory implements Factory
{
   public String createPage(String content)
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<html>");
      sb.append(createHeader());
      sb.append(createBody(content));
      sb.append("</html>");
      return sb.toString();
   }
   public String createHeader()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<head><title>");
      sb.append("Introduction");
      sb.append("</title></head>");
      return sb.toString();
   }
   public String createTitle()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<h2>");
      sb.append("Introduction");
      sb.append("</h2>");
      return sb.toString();
   }
   public String createBody(String content)
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<body background=\"Detail.gif\">");
      sb.append(createTitle());
      sb.append(content);
      sb.append("</body>");
      return sb.toString();
   }
}
