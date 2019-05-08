import java.awt.*;

public class Circle implements Shape
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
      g.setColor(Color.black);
      g.drawOval(getX(), getY(), 10, 10);
   }
}