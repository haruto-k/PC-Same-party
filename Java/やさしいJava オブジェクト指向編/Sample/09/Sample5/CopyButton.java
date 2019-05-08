import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CopyButton extends JButton implements ActionListener
{
   private Manager mn;

   public CopyButton(Manager m)
   {
      ImageIcon ic = new ImageIcon("Copy.gif");
      setIcon(ic);
      mn = m;
      addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      mn.copy();
   }
}
