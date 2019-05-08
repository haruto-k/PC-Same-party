import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolEditorBuilder implements FrameBuilder
{
   private JFrame fr;
   private JButton bt[] = new JButton[3];
   private JToolBar tl;
   private Icon ic;
   private JTextArea ta;
   private String name[] = {"Cut", "Copy", "Paste"};

   public void createFrame()
   {
      fr = new JFrame("ƒTƒ“ƒvƒ‹");
   }
   public void createComponents()
   {
      ta = new JTextArea();
      ta.setLineWrap(true);
      tl = new JToolBar();
   
      for(int i=0; i<bt.length; i++){
         ic = new ImageIcon(name[i] + ".gif");
         bt[i] = new JButton(ic); 
         tl.add(bt[i]);
     }
      fr.add(tl, BorderLayout.NORTH);
      fr.add(ta, BorderLayout.CENTER);
   }
   public void addListeners()
   {
      for(int i=0; i<bt.length; i++){
         bt[i].addActionListener(new SampleActionListener()); 
      }
   }
   public void setFrame()
   {
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fr.setSize(300, 300);
      fr.setVisible(true);
   }
   public JFrame getFrame()
   {
      return fr;
   }
   class SampleActionListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         AbstractButton tmp = (AbstractButton) e.getSource();
         if(tmp == bt[0])
             ta.cut();
         else if(tmp == bt[1])
             ta.copy();            
         else
             ta.paste(); 
      }
   }
}
