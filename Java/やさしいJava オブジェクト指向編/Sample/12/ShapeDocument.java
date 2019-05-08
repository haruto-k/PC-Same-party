import java.io.*;
import java.util.*;

public class ShapeDocument
{
   private ArrayList<Shape> shapelist = new ArrayList<Shape>();

   public void open(File file)
   {
      try{
         ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file));
         Shape sh = null;
         shapelist.clear();
         while((sh = (Shape)oi.readObject()) != null){
            shapelist.add(sh);            
         }
         oi.close();
      }catch(Exception e){}
   }
   public void save(File file)
   {
      try{
         ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(file));
         Iterator it = shapelist.iterator();
         while(it.hasNext()){
            Shape sh = (Shape)it.next();
            oo.writeObject(sh);
         }
         oo.close();
      }catch(Exception e){}
   }
   ArrayList<Shape> getShapeList(){return shapelist;}
}