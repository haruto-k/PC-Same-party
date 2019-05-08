import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SelectState implements State
{
   boolean isSelected = false;
   public void mousePressed(MouseEvent e, ArrayList<Shape> list)
   {
      Iterator<Shape> it = list.iterator();
      Shape sh = null;
      while(it.hasNext()){
         sh = it.next();
         int x1 = sh.getStartX();
         int y1 = sh.getStartY(); 
         int x2 = sh.getEndX();
         int y2 = sh.getEndY();
         if(x1 <= e.getX() && y1<=e.getY() && x2>= e.getX() && y2>=e.getY()){
            it.remove();
            list.add(sh);
            isSelected = true; 
            return;
         }
      }
      isSelected = false; 
   }
   public void mouseReleased(MouseEvent e, ArrayList<Shape> list)
   {
      if(isSelected == false) return;
      Shape sh = list.get(list.size()-1);
      int x1 = sh.getStartX();
      int y1 = sh.getStartY(); 
      int x2 = sh.getEndX();
      int y2 = sh.getEndY();
      sh.setStartPoint(e.getX(), e.getY());
      sh.setEndPoint(e.getX()+x2-x1, e.getY()+y2-y1);
   }
}
