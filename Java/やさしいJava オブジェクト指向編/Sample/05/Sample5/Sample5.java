import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
      private ArrayList<Shape> shapelist = new ArrayList<Shape>();
 
      public SamplePanel()
      {
         addMouseListener(new SampleMouseListener());
      }
      public void paint(Graphics g)
      {
         super.paint(g);
         Iterator<Shape> it = shapelist.iterator();
         while(it.hasNext()){
            Shape sh = it.next();
            sh.draw(g);
         }
      }
      public class SampleMouseListener extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
            shapelist.add(new Hook(e.getX(),e.getY()));
            repaint();
         }
      }
   }
}
