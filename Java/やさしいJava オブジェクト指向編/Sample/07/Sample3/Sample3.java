import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample3 extends JFrame implements ActionListener
{
   private SamplePanel sp;
   private JToggleButton bt[] = new JToggleButton[3];
   private JToolBar tl;
   private Icon ic;
   private ButtonGroup bg;
   private String shape[] = {"Circle", "Rectangle", "Select"};
   private State curState;

   public static void main(String args[])
   {
      Sample3 sm = new Sample3();
   }
   public Sample3()
   {
      super("ƒTƒ“ƒvƒ‹");
      setState(new CircleState());

      sp = new SamplePanel();
      tl = new JToolBar();
      bg = new ButtonGroup();   

      for(int i=0; i<bt.length; i++){
         ic = new ImageIcon(shape[i] + ".gif");
         bt[i] = new JToggleButton(ic); 
         bt[i].setToolTipText(shape[i]); 
         bt[i].addActionListener(this);
         bg.add(bt[i]);
         tl.add(bt[i]);
      }
      add(tl, BorderLayout.NORTH);
      add(sp, BorderLayout.CENTER);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
   public void setState(State s)
   {
      curState = s;
   }
   public void actionPerformed(ActionEvent e)
   {
      JToggleButton tmp = (JToggleButton) e.getSource();
      if(tmp == bt[0])
          setState(new CircleState());
      else if(tmp == bt[1])
          setState(new RectState());
      else if(tmp == bt[2])
          setState(new SelectState());
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
            curState.mousePressed(e, shapelist);
            repaint();
         }
         public void mouseReleased(MouseEvent e)
         {
            curState.mouseReleased(e, shapelist);
            repaint();
         }
      }
   }
}
