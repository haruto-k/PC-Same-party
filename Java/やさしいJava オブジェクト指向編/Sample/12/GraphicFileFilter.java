import java.io.*;

public class GraphicFileFilter extends javax.swing.filechooser.FileFilter
{
   public boolean accept(File f)
   {
      if(f.isDirectory()){
         return true;
      }
      String fn = f.getName();
      if(fn.toLowerCase().endsWith(".g")){
         return true;
      }
      return false;
   }
   public String getDescription()
   {
      return "グラフィックファイル";
   }
}
