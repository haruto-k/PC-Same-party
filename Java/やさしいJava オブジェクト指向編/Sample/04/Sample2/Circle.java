import java.awt.*;

public class Circle
{
   private int x;
   private int y;

   public Circle(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   public int getX(){return x;}
   public int getY(){return y;}
   public void draw(Graphics g)
   {
      g.drawOval(x, y, 10, 10);
   }   
}
