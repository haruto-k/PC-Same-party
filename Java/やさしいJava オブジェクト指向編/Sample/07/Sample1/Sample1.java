import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample1 extends JFrame implements ActionListener
{
   private SamplePanel sp;
   private JButton bt[] = new JButton[3];
   private JToolBar tl;
   private Icon ic;
   private Shape sh;
   private int state;

   public static void main(String args[])
   {
      Sample1 sm = new Sample1();
   }
   public Sample1()
   {
      super("ƒTƒ“ƒvƒ‹");
      sp = new SamplePanel();
      tl = new JToolBar();
   
      for(int i=0; i<bt.length; i++){
         ic = new ImageIcon(Shape.name[i] + ".gif");
         bt[i] = new JButton(ic); 
         bt[i].setToolTipText(Shape.name[i]); 
         bt[i].addActionListener(this);
         tl.add(bt[i]);
      }

      add(tl, BorderLayout.NORTH);
      add(sp, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      JButton tmp = (JButton) e.getSource();

      if(tmp == bt[0])
          state = Shape.CIRCLE;
      else if(tmp == bt[1])
          state = Shape.RECTANGLE;
      else if(tmp == bt[2])
          state = Shape.LINE;
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
            ShapeFactory sf = new ShapeFactory();
            Shape sh = sf.createShape(state, e.getX(),e.getY());
            shapelist.add(sh);
            repaint();
         }
      }
   }
}
