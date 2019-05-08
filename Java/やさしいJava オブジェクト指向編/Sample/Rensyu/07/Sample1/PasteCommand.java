import javax.swing.*;
import javax.swing.text.*;

public class PasteCommand implements Command
{
   private JTextComponent tc;

   public PasteCommand(JTextComponent tc)
   {
      this.tc = tc;
   }
   public void execute()
   {
      tc.paste();
   }
}
