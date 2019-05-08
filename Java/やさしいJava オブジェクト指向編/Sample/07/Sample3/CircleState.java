import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CircleState implements State
{
   public void mousePressed(MouseEvent e, ArrayList<Shape> list)
   {
      Shape sh = new Circle();
      sh.setStartPoint(e.getX(), e.getY());
      list.add(sh);
   }
   public void mouseReleased(MouseEvent e, ArrayList<Shape> list)
   {
      Shape sh = list.get(list.size()-1);
      sh.setEndPoint(e.getX(), e.getY());
   }
}
