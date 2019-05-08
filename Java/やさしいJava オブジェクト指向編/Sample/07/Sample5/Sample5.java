import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample5 extends JFrame implements ActionListener
{
   private JButton bt[] = new JButton[3];
   private JToolBar tl;
   private Icon ic;
   private JTextArea ta;
   private String name[] = {"Cut", "Copy", "Paste"};

   public static void main(String args[])
   {
      Sample5 sm = new Sample5();
   }
   public Sample5()
   {
      super("ƒTƒ“ƒvƒ‹");
      ta = new JTextArea();
      ta.setLineWrap(true);
      tl = new JToolBar();
   
      for(int i=0; i<bt.length; i++){
         ic = new ImageIcon(name[i] + ".gif");
         bt[i] = new JButton(ic); 
         tl.add(bt[i]);
      }

      add(tl, BorderLayout.NORTH);
      add(ta, BorderLayout.CENTER);

      for(int i=0; i<bt.length; i++){
         bt[i].addActionListener(this); 
      }
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      JButton tmp = (JButton) e.getSource();
      Command c;

      if(tmp == bt[0])
          c = new CutCommand(ta);
      else if(tmp == bt[1])
          c = new CopyCommand(ta); 
      else
          c = new PasteCommand(ta); 
      c.execute();
   }
}
