import java.awt.*;
import java.awt.event.*;
import java.util.*;

public interface State
{
   public void mousePressed(MouseEvent e, ArrayList<Shape> list, Color c);
   public void mouseReleased(MouseEvent e, ArrayList<Shape> list);
}
