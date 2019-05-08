import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Sample4 extends JFrame
{
   private SamplePanel sp;

   public static void main(String args[])
   {
      Sample4 sm = new Sample4();
   }
   public Sample4()
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
      private ArrayList<Circle> circlelist = new ArrayList<Circle>();
 
      public SamplePanel()
      {
         addMouseListener(new SampleMouseListener());
      }
      public void paint(Graphics g)
      {
         super.paint(g);
         Iterator<Circle> it = circlelist.iterator();
         while(it.hasNext()){
            Circle c = it.next();
            c.draw(g);
         }
      }
      public class SampleMouseListener extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
            circlelist.add(new Circle(e.getX(),e.getY()));
            repaint();
         }
      }
   }
}
