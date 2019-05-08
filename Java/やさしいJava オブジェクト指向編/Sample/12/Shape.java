import java.awt.*;

public interface Shape
{
   static final int CIRCLE    = 0;
   static final int RECTANGLE = 1;

   public void setColor(Color c);
   public void setStartPoint(int x1, int y1);
   public void setEndPoint(int x2, int y2);
   public int getStartX();
   public int getStartY();
   public int getEndX();
   public int getEndY();
   public void draw(Graphics g);
}
