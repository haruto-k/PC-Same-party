import java.awt.*;

public class FilledCircle extends Circle
{
   public FilledCircle(int x, int y)
   {
      super(x, y);
   }
   public void draw(Graphics g)
   {
      g.fillOval(getX(), getY(), 10, 10);
   }
}
