import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample3 extends JFrame
{
   private SamplePanel sp;

   private int state;

   public static void main(String args[])
   {
      Sample3 sm = new Sample3();
   }
   public Sample3()
   {
      super("�T���v��");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300,300);
      sp = new SamplePanel();
      add(sp, BorderLayout.CENTER);
      state = Shape.CIRCLE;
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
            if(state == Shape.CIRCLE){
               shapelist.add(new Circle(e.getX(),e.getY()));
               state = Shape.RECTANGLE;
            }
            else{
               shapelist.add(new Rectangle(e.getX(),e.getY()));
               state = Shape.CIRCLE;
            }
            repaint();
         }
      }
   }
}
