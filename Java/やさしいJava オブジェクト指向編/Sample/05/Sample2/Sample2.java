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
      super("�T���v��");
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
            shapelist.add(new ShadeCircle(new Circle(e.getX(),e.getY())));
            repaint();
         }
      }
   }
}
