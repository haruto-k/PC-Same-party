import java.io.*;

public class SimpleFactory implements Factory
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
      sb.append("書籍紹介");
      sb.append("</title></head>");
      return sb.toString();
   }
   public String createTitle()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<h1>");
      sb.append("やさしいプログラミング");
      sb.append("</h1>");
      return sb.toString();
   }
   public String createBody(String content)
   {
      StringBuffer sb = new StringBuffer();
      sb.append("<body background=\"Simple.gif\">");
      sb.append(createTitle());
      sb.append(content);
      sb.append("</body>");
      return sb.toString();
   }
}
