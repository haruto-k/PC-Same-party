import java.io.*;

public interface Factory
{
   public String createPage(File f);
   public String createHeader();
   public String createBody();
}