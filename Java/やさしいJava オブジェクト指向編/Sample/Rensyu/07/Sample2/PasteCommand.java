import javax.swing.*;
import javax.swing.text.*;

public class PasteCommand implements Command
{
   JTextComponent tc;

   public PasteCommand(JTextComponent tc)
   {
      this.tc = tc;
   }
   public void execute()
   {
      tc.paste();
   }
}
