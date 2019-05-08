import java.awt.*;

public abstract class MyLabel
{
   int x, y;

   public MyLabel(){}
   public MyLabel(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   public int getX(){return x;}
   public int getY(){return y;}

   public abstract void draw(Graphics g);
}
