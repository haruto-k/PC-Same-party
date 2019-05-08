import java.awt.*;

public class Line implements Shape
{
   private int x;
   private int y;

   public Line(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   public int getX(){return x;}
   public int getY(){return y;}
   public void draw(Graphics g)
   {
      g.drawLine(x, y, x+10, y+10);
   }   
}