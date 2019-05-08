import java.awt.*;

public class Ball
{
   int x, y;

   public Ball(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   void draw(Graphics g)
   {
      g.fillOval(x, y, 10, 10);
   }
}
