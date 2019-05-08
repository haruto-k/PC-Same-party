 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample2 extends JFrame implements ActionListener
{
   private JButton bt[] = new JButton[3];
   private JToolBar tl;
   private Icon ic;
   private JTextField tf;
   private String name[] = {"Cut", "Copy", "Paste"};

   public static void main(String args[])
   {
      Sample2 sm = new Sample2();
   }
   public Sample2()
   {
      super("ƒTƒ“ƒvƒ‹");
      tf = new JTextField();
      tl = new JToolBar();
   
      for(int i=0; i<bt.length; i++){
         ic = new ImageIcon(name[i] + ".gif");
         bt[i] = new JButton(ic); 
         tl.add(bt[i]);
      }

      add(tl, BorderLayout.NORTH);
      add(tf, BorderLayout.CENTER);

      for(int i=0; i<bt.length; i++){
         bt[i].addActionListener(this); 
      }
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      JButton tmp = (JButton) e.getSource();
      Command c;

      if(tmp == bt[0])
          c = new CutCommand(tf);
      else if(tmp == bt[1])
          c = new CopyCommand(tf); 
      else
          c = new PasteCommand(tf); 
      c.execute();
   }
}
