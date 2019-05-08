import java.awt.*;

public interface Shape
{
   public static final int CIRCLE    = 0;
   public static final int RECTANGLE = 1;
   public static final int LINE      = 2;

   public abstract int getX();
   public abstract int getY();
   public abstract void draw(Graphics g);
}
