public interface Factory
{
   public String createPage(String content);
   public String createHeader();
   public String createTitle();
   public String createBody(String content);
}
