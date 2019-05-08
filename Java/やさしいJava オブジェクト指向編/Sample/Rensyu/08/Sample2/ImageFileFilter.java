import java.io.*;

class ImageFileFilter implements FileFilter
{
   public boolean accept(File f)
   {
      String fn = f.getName();
      if(fn.toLowerCase().endsWith(".jpg") || fn.toLowerCase().endsWith(".gif")){
          return true;
      }
      return false;
   }
}