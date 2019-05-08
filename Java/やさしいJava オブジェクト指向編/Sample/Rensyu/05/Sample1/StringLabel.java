import java.awt.*;
import java.awt.geom.*;

public class StringLabel extends MyLabel
{
   private String s;

   public StringLabel(String s, int x, int y)
   {
      super(x, y);
      this.s = s;
   }
   public String getString(){return s;}
   public void draw(Graphics g)
   { 
      FontMetrics fm = g.getFontMetrics();
      Rectangle2D rd = fm.getStringBounds(s, g);
      g.drawString(s, getX(), getY());
      g.drawRect(getX(), getY()-(int)rd.getHeight(), (int)rd.getWidth(), (int)rd.getHeight());
   }
}
