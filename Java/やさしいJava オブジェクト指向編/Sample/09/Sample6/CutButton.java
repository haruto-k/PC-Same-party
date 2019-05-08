import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CutButton extends JButton implements ActionListener
{
   private Manager mn;

   public CutButton(Manager m)
   {
      ImageIcon ic = new ImageIcon("Cut.gif");
      setIcon(ic);
      mn = m;
      addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      mn.cut();
   }
}
