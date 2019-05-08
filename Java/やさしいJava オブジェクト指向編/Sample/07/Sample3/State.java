import java.awt.event.*;
import java.util.*;

public interface State
{
   public void mousePressed(MouseEvent e, ArrayList<Shape> l);
   public void mouseReleased(MouseEvent e, ArrayList<Shape> l);
}
