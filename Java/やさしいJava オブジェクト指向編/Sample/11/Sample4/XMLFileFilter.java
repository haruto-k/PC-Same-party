import java.io.*;

public class XMLFileFilter extends javax.swing.filechooser.FileFilter
{
   public boolean accept(File f)
   {
      if(f.isDirectory()){
         return true;
      }
      String fn = f.getName();
      if(fn.toLowerCase().endsWith(".xml")){
          return true;
      }
      return false;
   }
   public String getDescription()
   {
      return "xmlƒtƒ@ƒCƒ‹";
   }
}
