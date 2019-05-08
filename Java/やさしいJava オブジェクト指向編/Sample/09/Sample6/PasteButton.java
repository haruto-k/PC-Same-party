import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PasteButton extends JButton implements ActionListener
{
   private Manager mn;

   public PasteButton(Manager m)
   {
      ImageIcon ic = new ImageIcon("Paste.gif");
      setIcon(ic);
      mn = m;
      addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      mn.paste();
   }
}
