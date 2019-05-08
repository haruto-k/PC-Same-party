import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Sample5 extends JFrame
{
   private SamplePanel sp;

   public static void main(String args[])
   {
      Sample5 sm = new Sample5();
   }
   public Sample5()
   {
      super("ƒTƒ“ƒvƒ‹");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300,300);
      sp = new SamplePanel();
      add(sp, BorderLayout.CENTER);
      setVisible(true);
   }
   public class SamplePanel extends JPanel
   {
      private ArrayList<Rectangle> rectlist = new ArrayList<Rectangle>();
 
      public SamplePanel()
      {
         addMouseListener(new SampleMouseListener());
      }
      public void paint(Graphics g)
      {
         super.paint(g);
         Iterator<Rectangle> it = rectlist.iterator();
         while(it.hasNext()){
            Rectangle r = it.next();
            r.draw(g);
         }
      }
      public class SampleMouseListener extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
            rectlist.add(new Rectangle(e.getX(),e.getY()));
            repaint();
         }
      }
   }
}
