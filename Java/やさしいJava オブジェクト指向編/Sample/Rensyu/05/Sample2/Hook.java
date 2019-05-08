import java.util.*;
import java.awt.*;

public class Hook
{
   private Ball bl;

   public Hook()
   {
      Random rnd = new Random();

      int x = rnd.nextInt(300);
      int y = rnd.nextInt(300);

      bl = new Ball(x, y);
   }
   public void draw(Graphics g)
   {
      Random rnd = new Random();

      int r = rnd.nextInt(255);
      int gr = rnd.nextInt(255);
      int b = rnd.nextInt(255);

      Color c = new Color(r, gr, b);

      g.setColor(c);
      bl.draw(g);
   }
}
