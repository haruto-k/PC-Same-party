import javax.swing.*;
import javax.swing.text.*;

public class CopyCommand implements Command
{
   private JTextComponent tc;

   public CopyCommand(JTextComponent tc)
   {
      this.tc = tc;  
   }
   public void execute()
   {
      tc.copy();
   }
}
