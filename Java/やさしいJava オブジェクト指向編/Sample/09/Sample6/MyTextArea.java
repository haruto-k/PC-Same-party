import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyTextArea extends JTextArea implements CaretListener
{
   private Manager mn;

   public MyTextArea(Manager m)
   {
      mn = m;
      addCaretListener(this);
   }
   public void caretUpdate(CaretEvent e)
   { 
      mn.caretUpdate();
   }
}
