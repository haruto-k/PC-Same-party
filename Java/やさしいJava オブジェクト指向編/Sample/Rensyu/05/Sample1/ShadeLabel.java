import java.awt.*;
import java.awt.geom.*;

public class ShadeLabel extends MyLabel
{
   private StringLabel sl;

   public ShadeLabel(StringLabel l)
   {
      sl = l;
   }
   public void draw(Graphics g)
   {
      sl.draw(g);
      String str = sl.getString();
      FontMetrics fm = g.getFontMetrics();
      Rectangle2D rd = fm.getStringBounds(str, g);
      g.setColor(Color.gray);
      g.fillRect(sl.getX()+5, sl.getY()+5, (int)rd.getWidth(), 5);
   }
}
