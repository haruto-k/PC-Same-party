import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample extends JFrame
{
   private SamplePanel sp;
   private JToggleButton bt[] = new JToggleButton[3];
   private JToolBar tl;
   private Icon ic;
   private ButtonGroup bg;
   private JMenuBar mb;
   private JMenu mn[] = new JMenu[2];
   private JMenuItem mi[] = new JMenuItem[3];

   private String shape[] = {"Circle", "Rectangle", "Select"};
   private ShapeDocument sdoc;
   private State curState;
   private Color curColor;

   public static void main(String args[])
   {
      Sample sm = new Sample();
   }
   public Sample()
   {
      super("�T���v��");
      curState = new CircleState();
      curColor = Color.blue;

      sdoc = new ShapeDocument();

      sp = new SamplePanel();
      tl = new JToolBar();
      bg = new ButtonGroup();   

      for(int i=0; i<bt.length; i++){
         ic = new ImageIcon(shape[i] + ".gif");
         bt[i] = new JToggleButton(ic); 
         bt[i].setToolTipText(shape[i]); 
         bt[i].addActionListener(new SampleToolListener());
         bg.add(bt[i]);
         tl.add(bt[i]);
      }

      mb = new JMenuBar();
      mn[0] = new JMenu("�t�@�C��");
      mn[1] = new JMenu("�ݒ�");
      mi[0] = new JMenuItem("�J��");
      mi[1] = new JMenuItem("�ۑ�");
      mi[2] = new JMenuItem("�F");

      for(int i=0; i<mi.length; i++){
         mi[i].addActionListener(new SampleMenuListener());
      }

      mn[0].add(mi[0]);
      mn[0].add(mi[1]);
      mn[1].add(mi[2]);

      mb.add(mn[0]);
      mb.add(mn[1]);
      
      add(mb, BorderLayout.NORTH);
      add(tl, BorderLayout.SOUTH);
      add(sp, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(600, 400);
      setVisible(true);
   }
   public class SampleToolListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         JToggleButton tmp = (JToggleButton)e.getSource();
         if(tmp == bt[0])
           curState = new CircleState();
         else if(tmp == bt[1])
           curState = new RectState();
         else if(tmp == bt[2])
           curState = new SelectState();
       }
   }
   public class SampleMenuListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         JMenuItem tmp = (JMenuItem)e.getSource();
         if(tmp == mi[0])
         {
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new GraphicFileFilter());
            int res = fc.showOpenDialog(null);
            if(res == JFileChooser.APPROVE_OPTION){       
               File file = fc.getSelectedFile();
               sdoc.open(file);
               repaint();
            }
         }        
         else if(tmp == mi[1]){
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new GraphicFileFilter());
            int res = fc.showSaveDialog(null);
            if(res == JFileChooser.APPROVE_OPTION){       
               File file = fc.getSelectedFile();
               sdoc.save(file);
               repaint();
            }
         }
         else if(tmp == mi[2]){
            curColor = JColorChooser.showDialog(null, "�F�̑I��", Color.black);
          }
      }
   }
   public class SamplePanel extends JPanel
   {
      public SamplePanel()
      {
         addMouseListener(new SamplePanelMouseListener());
      }
      public void paint(Graphics g)
      {
         super.paint(g);
         ArrayList<Shape> shapelist = sdoc.getShapeList();
         Iterator<Shape> it = shapelist.iterator();
         while(it.hasNext()){
            Shape sh =it.next();
            sh.draw(g);
         }
      }
      public class SamplePanelMouseListener extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
            ArrayList<Shape> shapelist = sdoc.getShapeList();
            curState.mousePressed(e, shapelist, curColor);
            repaint();
         }
         public void mouseReleased(MouseEvent e)
         {
            ArrayList<Shape> shapelist = sdoc.getShapeList();
            curState.mouseReleased(e, shapelist);
            repaint();
         }
      }
   }
}
