import javax.swing.*;

public class CopyCommand implements Command
{
   private JTextArea ta;

   public CopyCommand(JTextArea ta)
   {
      this.ta = ta;  
   }
   public void execute()
   {
      ta.copy();
   }
}
