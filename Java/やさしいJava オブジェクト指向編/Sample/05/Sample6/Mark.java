import java.awt.*;

public abstract class Mark implements Shape
{
   protected Shape shape;

   public Mark(Shape s)
   {
      shape = s;
   }
   public abstract void draw(Graphics g);
}