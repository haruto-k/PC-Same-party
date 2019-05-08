import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample2 extends JFrame
{
   private SamplePanel sp;

   public static void main(String args[])
   {
      Sample2 sm = new Sample2();
   }
   public Sample2()
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
      private ArrayList<FilledCircle> fccirclelist = new ArrayList<FilledCircle>();
 
      public SamplePanel()
      {
         addMouseListener(new SampleMouseListener());
      }
      public void paint(Graphics g)
      {
         super.paint(g);
         Iterator<FilledCircle> it = fccirclelist.iterator();
         while(it.hasNext()){
            FilledCircle fc = it.next();
            fc.draw(g);
         }
      }
      public class SampleMouseListener extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
            fccirclelist.add(new FilledCircle(e.getX(),e.getY()));
            repaint();
         }
      }
   }
}
