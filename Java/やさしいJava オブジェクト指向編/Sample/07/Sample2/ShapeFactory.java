import java.lang.reflect.*;

public class ShapeFactory
{
   private Shape sh;

   Shape createShape(int state, int x, int y)
   {
      try{
         Class<?> cl = Class.forName(Shape.name[state]);
         Class<?> param[] = {int.class, int.class};
         Object init[] = {x, y};
         Constructor<?> cn = cl.getConstructor(param);
         sh = (Shape)cn.newInstance(init);
      }
      catch(Exception e){}

      return sh;
   }
}